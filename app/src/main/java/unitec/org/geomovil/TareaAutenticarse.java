package unitec.org.geomovil;

import android.content.Context;
import android.os.AsyncTask;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


public class TareaAutenticarse extends AsyncTask<Integer, String, String> {

    public  TareaAutenticarse(Context ctx){

    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected String doInBackground(Integer... integers) {

        String url = "";

// Creamos una instancia de RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// Agregams el convertidor de string
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

// Efectuamos el GET
        String result = restTemplate.getForObject(url, String.class);
        return null;
    }
}
