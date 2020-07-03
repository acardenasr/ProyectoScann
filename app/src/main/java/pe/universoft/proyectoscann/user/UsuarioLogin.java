package pe.universoft.proyectoscann.user;
import android.os.Parcel;
import android.os.Parcelable;

public class UsuarioLogin /*implements Parcelable*/ {

    private String usuario;
    private String password;

    public UsuarioLogin(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
/*
    protected UsuarioLogin(Parcel in) {
        usuario = in.readString();
        password = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(usuario);
        dest.writeString(password);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<UsuarioLogin> CREATOR = new Parcelable.Creator<UsuarioLogin>() {
        @Override
        public UsuarioLogin createFromParcel(Parcel in) {
            return new UsuarioLogin(in);
        }

        @Override
        public UsuarioLogin[] newArray(int size) {
            return new UsuarioLogin[size];
        }
    };*/
}