package com.myapp.user.controlesper2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by User on 09/03/2016.
 */
public class Controllogin extends LinearLayout {
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView lblMensaje;

    private OnLoginListener listener;
        public Controllogin(Context context){
            super(context);
            inicializar();
        }
        public Controllogin(Context context, AttributeSet attrs){
            super(context, attrs);
            inicializar();

            TypedArray a =  getContext().obtainStyledAttributes(attrs, R.styleable.Controllogin);

            String textoBoton= a.getString(R.styleable.Controllogin_Login_text);

            btnLogin.setText(textoBoton);
            a.recycle();
        }
    private void inicializar(){
        String inicializar = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService();
        li.inflate(R.layout.control_login, this, true);

        txtUsuario = (EditText) findViewById(R.id.TxUsuario01);
        txtPassword = (EditText) findViewById(R.id.TxtPassword);
        btnLogin = (Button) findViewById(R.id.BtnAceptar);
        lblMensaje = (TextView) findViewById(R.id.LblMensaje);

        asignarEventos();
    }

    public  void setOnLoginListener(OnLoginListener l){
        listener= l;

    }

    public void asignarEventos(){
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnLoginListener(txtUsuario.getText().toString(), txtPassword.getText().toString());
            }
        });

    }
    public void setMensaje(String msg){
        lblMensaje.setText(msg);
    }
}
