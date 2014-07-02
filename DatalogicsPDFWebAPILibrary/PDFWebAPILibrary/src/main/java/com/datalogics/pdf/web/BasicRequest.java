package com.datalogics.pdf.web;

import android.os.AsyncTask;

/**
 * Created by bhaugen on 7/1/14.
 */
public class BasicRequest extends AsyncTask {

    final static String WEB_API_URL = "https://pdfprocess.datalogics-cloud.com/api/actions/";

    String applicationID;
    String applicationKey;

    String inputFile;
    String inputFilePassword;

    public BasicRequest(String applicationID, String applicationKey, String inputFile) {
        this.applicationID = applicationID;
        this.applicationKey = applicationKey;

        this.inputFile = inputFile;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getApplicationKey() {
        return applicationKey;
    }

    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getInputFilePassword() {
        return inputFilePassword;
    }

    public void setInputFilePassword(String inputFilePassword) {
        this.inputFilePassword = inputFilePassword;
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }
}
