package com.anton.EEAWeb.config;

import javax.sql.DataSource;

import com.anton.EEAWeb.service.EmployeeDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public UserDetailsService userDetailsService() {
		return new EmployeeDetailsServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/resources/**", "/about-page", "/login-page", "/home-page").permitAll()
				.antMatchers("/css/**", "/css2/**", "/css3/**", "/font/**", "/img/**", "/img2/**", "/js/**", "/js2/**", "/php/**", "/vender2/**").permitAll()

//				.antMatchers("/").hasAnyAuthority("ADMIN", "MANAGER")
				.antMatchers("/adminhome").hasAnyAuthority("ADMIN")
				.antMatchers("/managerhome").hasAnyAuthority("MANAGER")
				.antMatchers("/receptionhome").hasAnyAuthority("RECEPTION")
				.antMatchers("/edit/**").hasAnyAuthority("MANAGER")
				.antMatchers("/delete/**").hasAuthority("ADMIN")
//				.anyRequest().authenticated()

				.and()

				.formLogin()
				.loginPage("/login")
				.permitAll()

				.and()

				.logout()
				.permitAll()

				.and()

				.exceptionHandling().accessDeniedPage("/errorpage")
		;

		http.authorizeRequests().antMatchers("/**").permitAll().anyRequest().authenticated().and().csrf().disable();
	}
}
