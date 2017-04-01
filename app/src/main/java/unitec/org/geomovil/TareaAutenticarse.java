package unitec.org.geomovil;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.provider.Settings;
import android.widget.Toast;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


public class TareaAutenticarse extends AsyncTask<Integer, String, String> {
Context context;
    ProgressDialog dialog;
    public static String resultado="nada";
    public static String mensaje="malo";
    public  TareaAutenticarse(Context ctx){
context=ctx;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();


    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
     //   Toast.makeText(context, resultado, Toast.LENGTH_LONG).show();
       mensaje=resultado;



    }

    @Override
    protected String doInBackground(Integer... integers) {

        String url = "https://campitos.herokuapp.com/malo";

// Creamos una instancia de RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// Agregams el convertidor de string
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

// Efectuamos el GET
        resultado = restTemplate.getForObject(url, String.class);
       // restTemplate.postForObject(url,new Mensaje(), String.class );

        System.out.println("Conectado "+resultado);
        return null;
    }
}
