package com.datalogics.pdf.web;

/**
 * Created by bhaugen on 7/1/14.
 */
public class DecorateDocumentRequest extends BasicRequest {
    final static String REQUEST_PATH = "decorate/document";

    public String decorationDataFile;

    public DecorateDocumentRequest(String applicationID, String applicationKey, String inputFile, String decorationDataFile) {
        super(applicationID, applicationKey, inputFile);

        this.decorationDataFile = decorationDataFile;
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        // TODO any special processing that should happen for the DecorateDocumentRequest

        // Then call BasicRequest.doInBackground
        super.doInBackground(objects);
        return null;
    }
}
