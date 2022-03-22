package com.anton.EEAWeb.service;

import java.util.List;

import com.anton.EEAWeb.model.Inquiry;

public interface InquiryService {

    public void addInquiry(Inquiry inquiry);

    public List<Inquiry> listInquiry();

    public void updateInquiry(Inquiry inquiry);

    public void deleteInquiry(int id);
}
