package pe.universoft.proyectoscann.user;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pe.universoft.proyectoscann.MainActivity;
import pe.universoft.proyectoscann.R;

public class Login extends AppCompatActivity {

    public static final String USUARIO= "usuario";
    public static final String PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText usuario = findViewById(R.id.eusuario);
        final EditText password = findViewById(R.id.epassword);

        Button boton = findViewById(R.id.botonLogeo);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent enviar = new Intent(Login.this, MainActivity.class);
                final UsuarioLogin user = new UsuarioLogin(usuario.getText().toString(),password.getText().toString());

                enviar.putExtra(USUARIO,user.getUsuario());
                enviar.putExtra(PASSWORD,user.getPassword());

                startActivity(enviar);

            }
        });




    }
}