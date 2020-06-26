package pe.universoft.proyectoscann;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import pe.universoft.proyectoscann.user.UsuarioLogin;

public class Login extends AppCompatActivity {

   // public static final String USUARIO_REGISTRADO_KEY = "usuarioRegistrado";
    private EditText texuser;
    private EditText textpass;
    private Button boton;
    private TextView botonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        boton = findViewById(R.id.botonLogeo);
        botonRegistrar=findViewById(R.id.textViewRegistar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Bienvenido al ProtectoScann",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Login.this,MenuLateral.class);
                startActivity(intent);
            }
        });
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Registra tus datos",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Login.this,RegistroLogin.class);
                startActivity(intent);
            }
        });

    }
}