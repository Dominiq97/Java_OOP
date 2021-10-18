/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11;

import java.util.Date;

/**
 *
 * @author Dominic
 */
public class DayData {
    
    private Date dateDay;
    private int highTemp;
    private int lawTemp;
    private int precipitation;
    private int snow;

    public DayData(Date dateDay, int highTemp, int lawTemp, int precipitation, int snow) {
        this.dateDay = dateDay;
        this.highTemp = highTemp;
        this.lawTemp = lawTemp;
        this.precipitation = precipitation;
        this.snow = snow;
    }

    public Date getDateDay() {
        return dateDay;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public int getLawTemp() {
        return lawTemp;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public int getSnow() {
        return snow;
    }

    public void setDateDay(String dateDay) {
        this.dateDay = dateDay;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public void setLawTemp(int lawTemp) {
        this.lawTemp = lawTemp;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }

    public void setSnow(int snow) {
        this.snow = snow;
    }
    
    
    
}
