package id.sch.smktelkom_mlg.tugas01.xirpl5032.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Name, Mail, Pass;
    Button bOk;
    RadioButton R1, R2;
    CheckBox Check1, Check2, Check3;
    TextView tvHasil;
    Spinner Eskul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.editTextNama);
        Mail = (EditText) findViewById(R.id.editTextEmail);
        Pass = (EditText) findViewById(R.id.editTextPass);
        tvHasil = (TextView) findViewById(R.id.Hasilnya);
        Eskul = (Spinner) findViewById(R.id.DaftarKelas);
        Check1 = (CheckBox) findViewById(R.id.RPL);
        Check2 = (CheckBox) findViewById(R.id.TKJ);
        R1 = (RadioButton) findViewById(R.id.NOOB);
        R2 = (RadioButton) findViewById(R.id.GG);
        bOk = (Button) findViewById(R.id.buttonOK);


        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValid()) ;


                String nama = Name.getText().toString();
                String hasil = "\n\nJurusan Anda:";
                String kelas = null;
                int startlen = hasil.length();
                if (Check1.isChecked()) hasil += Check1.getText() + "\n";
                if (Check2.isChecked()) hasil += Check2.getText() + "\n";

                if (R2.isChecked()) {
                    kelas = R2.getText().toString();
                } else if (R1.isChecked()) {
                    kelas = R1.getText().toString();
                }

                if (hasil.length() == startlen) hasil += "Tidak Memilih";
                tvHasil.setText(
                        "\nNama Anda :" + nama
                                + "\n\nEkstra yang dipilih :"
                                + Eskul.getSelectedItem().toString()
                                + hasil + "\n\nKelas Anda:" + kelas);
            }


        });
    }

}


