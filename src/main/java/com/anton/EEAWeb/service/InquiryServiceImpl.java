package com.anton.EEAWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anton.EEAWeb.model.Inquiry;
import com.anton.EEAWeb.repository.InquiryRepository;

@Service
public class InquiryServiceImpl implements InquiryService {

    @Autowired
    private InquiryRepository inquiryRepository;

    @Override
    @Transactional
    public void addInquiry(Inquiry inquiry) {
        // TODO Auto-generated method stub
        this.inquiryRepository.save(inquiry);
    }

    @Override
    @Transactional
    public List<Inquiry> listInquiry() {
        // TODO Auto-generated method stub
        return inquiryRepository.findAll();
    }

    @Override
    @Transactional
    public void updateInquiry(Inquiry inquiry) {
        // TODO Auto-generated method stub

    }

    @Override
    @Transactional
    public void deleteInquiry(int id) {
        // TODO Auto-generated method stub
        this.inquiryRepository.deleteById(id);
    }

}
