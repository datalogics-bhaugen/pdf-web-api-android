package com.datalogics.pdf.web;

import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;

/**
 * Created by deepthi on 1/12/15.
 */
public class AddImagesRequest extends BasicRequest{
    final static String REQUEST_PATH = "add/images";

    public String imageSettingsFile;
    public String imageFile;

    public AddImagesRequest(String applicationID, String applicationKey, String inputFile, String outputFile, String imageSettingsFile, String imageFile) {
        super(applicationID, applicationKey, inputFile, outputFile);

        this.imageSettingsFile = imageSettingsFile;
        this.imageFile=imageFile;
    }

    @Override
    protected String doInBackground(Object[] objects) {
        // build the parts of the multipart form that are specific to the AddImages request
        MultipartEntityBuilder entity = MultipartEntityBuilder.create();
        entity.addPart("input", new FileBody(new File(inputFile)));
        entity.addPart("imageSettings", new FileBody(new File(imageSettingsFile)));
        entity.addPart("resource",new FileBody(new File(imageFile)));

        // create a new objects array to pass the info we need to down to the BasicRequest class
        objects = new Object[] {BasicRequest.WEB_API_URL + REQUEST_PATH, entity};

        // Then call BasicRequest.doInBackground
        return super.doInBackground(objects);
    }
}
