package com.service;

import com.model.TemperatureRecord;
import com.model.Page;

import java.util.List;

/**
 * Created by azhl on 2015/9/9.
 */
public interface TemperatureRecordService {
    public void addTemperatureRecord(TemperatureRecord temperatureRecord);
    public void deleteTemperatureRecord(TemperatureRecord temperatureRecord);
    public void updateTemperatureRecord(TemperatureRecord temperatureRecord);
    public List<TemperatureRecord> getTemperatureRecordList(Page page);
    public TemperatureRecord getTemperatureRecord(TemperatureRecord temperatureRecord);
}
