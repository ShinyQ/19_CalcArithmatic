package id.sch.smktelkom_mlg.tugas01.xirpl319.hitungaritmatika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText Hasil;
    Button Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan, Sembilan, Nol, Hapus, SamaDengan, Tambah, Kurang, Bagi, Kali;

    private int obj1;
    private int obj2;
    private float f1;
    private float f2;
    DecimalFormat format = new DecimalFormat();

    private String Operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Kalkulator Aritmatika");

        Hapus = (Button) findViewById(R.id.btn_hapus);
        SamaDengan = (Button) findViewById(R.id.btn_hasil);

        Satu = (Button) findViewById(R.id.btn_1);
        Dua = (Button) findViewById(R.id.btn_2);
        Tiga = (Button) findViewById(R.id.btn_3);
        Empat = (Button) findViewById(R.id.btn_4);
        Lima = (Button) findViewById(R.id.btn_5);
        Enam = (Button) findViewById(R.id.btn_6);
        Tujuh = (Button) findViewById(R.id.btn_7);
        Delapan = (Button) findViewById(R.id.btn_8);
        Sembilan = (Button) findViewById(R.id.btn_9);
        Nol = (Button) findViewById(R.id.btn_0);

        Tambah = (Button) findViewById(R.id.btn_tambah);
        Kurang = (Button) findViewById(R.id.btn_kurang);
        Bagi = (Button) findViewById(R.id.btn_bagi);
        Kali = (Button) findViewById(R.id.btn_kali);

        Hasil = (EditText) findViewById(R.id.hasil);

        try {

            Satu.setOnClickListener(this);
            Dua.setOnClickListener(this);
            Tiga.setOnClickListener(this);
            Empat.setOnClickListener(this);
            Lima.setOnClickListener(this);
            Enam.setOnClickListener(this);
            Tujuh.setOnClickListener(this);
            Delapan.setOnClickListener(this);
            Sembilan.setOnClickListener(this);
            Nol.setOnClickListener(this);
            Tambah.setOnClickListener(this);
            Kurang.setOnClickListener(this);
            Bagi.setOnClickListener(this);
            Kali.setOnClickListener(this);
            SamaDengan.setOnClickListener(this);
            Hapus.setOnClickListener(this);

        }

        catch (Exception e) {}

    }

    public void operatorProcess(){

     if (Operator.equals("+")){
         obj2 = Integer.parseInt(Hasil.getText().toString());
         Hasil.setText("");
         obj1 = obj1 + obj2;
         Hasil.setText(String.valueOf(obj1));
     }

        if (Operator.equals("-")){
            obj2 = Integer.parseInt(Hasil.getText().toString());
            Hasil.setText("");
            obj1 = obj1 - obj2;
            Hasil.setText(String.valueOf(obj1));
        }

        if (Operator.equals("*")){
            obj2 = Integer.parseInt(Hasil.getText().toString());
            obj1  = obj1 * obj2;
            Hasil.setText(String.valueOf(obj1));
        }

        if (Operator.equals("/")){
            f2 = Float.parseFloat(Hasil.getText().toString());
            f1 = f1 / f2;
            Hasil.setText(String.valueOf(format.format(f1)));

        }

    }

    public void onClick(View v) {
        Editable str = Hasil.getText();

        switch (v.getId()){

            case R.id.btn_0:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Nol.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_1:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Satu.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_2:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Dua.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_3:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Tiga.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_4:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Empat.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_5:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Lima.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_6:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Enam.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_7:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Tujuh.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_8:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Delapan.getText());
                Hasil.setText(str);
                break;

            case R.id.btn_9:
                if(obj2 != 0) {
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }
                str = str.append(Sembilan.getText());
                Hasil.setText(str);
                break;


            case R.id.btn_tambah:
                Operator = "+";
                if(obj1 == 0){
                    obj1 = Integer.parseInt(Hasil.getText().toString());
                    Hasil.setText("");
                }

                else if(obj2 != 0){
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");

                }

                else {
                    obj2 = Integer.parseInt(Hasil.getText().toString());
                    Hasil.setText("");
                    obj1 = obj1 + obj2;
                    Hasil.setText(String.valueOf(obj1));

                }

                break;


            case R.id.btn_kurang:
                Operator = "-";

                if(obj1 == 0){

                    obj1 = Integer.parseInt(Hasil.getText().toString());
                    Hasil.setText(""); }

                else if(obj2 != 0){
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }

                else{
                    obj2 = Integer.parseInt(Hasil.getText().toString());
                    Hasil.setText("");
                    obj1 = obj1 - obj2;
                    Hasil.setText(String.valueOf(obj1));
                }

                break;

            case R.id.btn_bagi:
                Operator = "/";
                if(f1 == 0){

                    f1 = Float.parseFloat(Hasil.getText().toString());
                    Hasil.setText("");
                }

                else if(f2 != 0){
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }

                else{
                    f2 = Float.parseFloat(Hasil.getText().toString());
                    Hasil.setText("/");
                    f1 = f1/f2;
                    Hasil.setText(String.valueOf(format.format(f1)));
                }

                break;

            case R.id.btn_kali:
                Operator = "*";
                if(obj1 == 0){
                    obj1 = Integer.parseInt(Hasil.getText().toString());
                Hasil.setText("");
                }

                else if(obj2 != 0){
                    obj2 = 0;
                    f2 = 0;
                    Hasil.setText("");
                }

                else{
                    obj2 = Integer.parseInt(Hasil.getText().toString());
                    Hasil.setText("");
                    obj1 = obj1 * obj2;
                    Hasil.setText(Double.toString(obj1));
                }

                break;

            case R.id.btn_hapus:
                obj1 = 0;
                obj2 = 0;
                f1 = 0;
                f2 = 0;
                Hasil.setText("");
                break;


            case R.id.btn_hasil:
                if(!Operator.equals(null)){
                    if(obj2 != 0){
                        if(Operator.equals("+")){
                            Hasil.setText("+"); /*op1 = op1 + op2;*/
                            Hasil.setText(String.valueOf(obj1));
                        }

                        else if(
                                Operator.equals("-")){
                            Hasil.setText("");/* op1 = op1 - op2;*/
                            Hasil.setText(String.valueOf(obj1));
                        }

                        else if(Operator.equals("*")){
                                    Hasil.setText("");/* op1 = op1 * op2;*/
                            Hasil.setText(String.valueOf(obj1));
                                }

                        else if(Operator.equals("/")){
                            Hasil.setText("");/* op1 = op1 / op2;*/
                            Hasil.setText(String.valueOf(f1));
                        }

                    }

                    else{
                        operatorProcess();
                    }

                } break;



        }

    }


}
