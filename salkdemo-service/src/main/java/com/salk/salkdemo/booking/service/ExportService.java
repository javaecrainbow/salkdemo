package com.salk.salkdemo.booking.service;

import java.util.List;

import com.salk.salkdemo.domain.Booking;
import com.salk.salkdemo.domain.Export;

public interface ExportService {
	public boolean addExport(Export e);
	public List<Export> getExports();

}
