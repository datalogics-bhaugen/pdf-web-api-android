package com.datalogics.pdf.web.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.datalogics.pdf.web.AddImagesRequest;
import com.datalogics.pdf.web.PropertiesRequest;
import com.datalogics.pdf.web.DecorateDocumentRequest;

public class PDFWebAPISampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfweb_apisample);

        String inputFile = "sdcard/test.pdf";
        String decorationDataFile = "sdcard/decoration.json";
        String imageSettingsFile = "sdcard/imageSettings.json";
        String outputTXTFile = "sdcard/testOutputTXT.txt";
        String outputPDFFile = "sdcard/testOutputPDF.pdf";
        String inputImageFile = "sdcard/testImage.jpg";
//        String inputFilePassword = "password";
        String applicationID = "";
        String applicationKey = "";

        // Invoke a PDF Web API to do something by using an Async Task
        DecorateDocumentRequest webAPITask = new DecorateDocumentRequest(applicationID, applicationKey, inputFile, outputPDFFile, decorationDataFile);
        webAPITask.execute();

        PropertiesRequest webAPIPropertiesTask = new PropertiesRequest(applicationID, applicationKey, inputFile, outputTXTFile, "");
        webAPIPropertiesTask.execute();

        AddImagesRequest webAPIAddImagesTask = new AddImagesRequest(applicationID, applicationKey, inputFile, outputPDFFile, imageSettingsFile,inputImageFile);
        webAPIAddImagesTask.execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pdfweb_apisample, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
