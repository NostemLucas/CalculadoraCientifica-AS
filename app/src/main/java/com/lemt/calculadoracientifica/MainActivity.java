package com.lemt.calculadoracientifica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bpi,btnigual,btnsuma,btnresta,btnmul,btndivision,btnseno,btncos,btntan,
    btnraiz, btnexpo, btne2,btnIn,btnlog,btndelete,btnclear,btnprn,btnprn2,btnfacto,btnex;
    TextView tv,tv2;
    String pi="3.14159";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.sfton)));
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.sfton));
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);

        bp=findViewById(R.id.bp);
        bpi=findViewById(R.id.bpi);
        btnigual=findViewById(R.id.btnigual);

        btnsuma=findViewById(R.id.btnsuma);
        btnresta=findViewById(R.id.btnresta);
        btnmul=findViewById(R.id.btnmul);
        btndivision=findViewById(R.id.btndivision);
        btnseno=findViewById(R.id.btnseno);
        btncos=findViewById(R.id.btncos);
        btnlog=findViewById(R.id.btnlog);
        btntan=findViewById(R.id.btntan);
        btnraiz=findViewById(R.id.btnraiz);
        btnex=findViewById(R.id.btnex);
        btnexpo=findViewById(R.id.btnexpo);
        btne2=findViewById(R.id.btne2);
        btnIn=findViewById(R.id.btbIn);
        btndelete=findViewById(R.id.btndelete);
        btnclear=findViewById(R.id.btnclear);
        tv=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv2);
        btnprn=findViewById(R.id.btnprn);
        btnprn2=findViewById(R.id.btnprn2);
        btnfacto=findViewById(R.id.btnfacto);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv =tv.getText().toString();
                tv.setText(prv+b1.getText().toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b2.getText().toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b3.getText().toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b4.getText().toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b5.getText().toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b6.getText().toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b7.getText().toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b8.getText().toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b9.getText().toString());
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+b0.getText().toString());
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String prv=tv.getText().toString();
                if (prv.equals("")){
                    tv.setText("0.");
                }
                else {
                    tv.setText(prv+bp.getText());
                }
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(prv+String.valueOf(pi));
            }
        });
        btnprn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+ "(");
            }
        });
        btnprn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+ ")");
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                if (!prv.equals("")){
                    tv.setText(prv+ btnsuma.getText().toString());
                }
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                if (!prv.equals("")){
                    tv.setText(prv+ btndivision.getText().toString());
                }
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                    tv.setText(prv+ btnresta.getText().toString());
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                if (!prv.equals("")){
                    tv.setText(prv+ btnmul.getText().toString());
                }
            }
        });
        btnraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                tv.setText(tv.getText()+"sqrt");
            }
        });

        btne2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"^"+ "2");
            }
        });
        btnex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"^");
            }
        });
        btnexpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String res=tv.getText().toString();
                    String tmp=res.replace('÷','/').replace('X','*');
                    double resultado=evaluador(tmp);
                    String r=String.valueOf(1/resultado);
                    tv2.setText(r);
                    tv.setText(res);
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Syntax Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"ln");
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString()+"log");
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();

                if (!prv.equals("")){
                    String aux="";

                    for (int i=0;i<prv.length()-1;i++){
                        char t=prv.charAt(i);
                        aux=aux+t;
                    }
                    tv.setText(aux);
                }
            }
        });
        btnseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                    tv.setText(tv.getText()+"sin");
            }
        });

        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                    tv.setText(tv.getText()+"cos");
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prv=tv.getText().toString();
                    tv.setText(tv.getText()+"tan");

            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String res=tv.getText().toString();
                    String tmp=res.replace('÷','/').replace('X','*');
                    double resultado=evaluador(tmp);
                    String r=String.valueOf(resultado);
                    tv2.setText(r);
                    tv.setText(res);
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Syntax Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                tv2.setText("");
            }
        });
        btnfacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString()+"!");

            }
        });
    }

    public static double evaluador(final String str)
    {

        return new Object(){
            int pos=-1,ch;
            void nextChar(){
                ch=(++pos<str.length())? str.charAt(pos): -1;
            }
            boolean eat(int charToEat){
                while (ch ==' ')nextChar();
                if (ch==charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse(){
                nextChar();
                double X=parseExpression();
                if (pos <str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return X;
            }

            double parseExpression(){
                double X=parseTerm();
                for (;;){
                    if (eat('+')) X +=parseTerm();
                    else if (eat('-')) X -=parseTerm();
                    else return X;
                }
            }
            double parseTerm(){
                double X =parseFactor();
                for (;;){
                    if (eat('*')) X *=parseFactor();
                    else if (eat('/')) X /=parseFactor();
                    else return X;
                }
            }
            double parseFactor(){
                if (eat('+')) return  parseFactor();
                if (eat('-')) return  parseFactor();

                double X;
                int starPost=this.pos;
                if (eat('(')){
                    X=parseExpression();
                    eat(')');
                }else if ((ch>= '0'  && ch<='9')|| ch =='.'){
                    while ((ch>= '0' && ch <='9')|| ch=='.')nextChar();
                    X=Double.parseDouble(str.substring(starPost,this.pos));

                }else if (ch>='a' && ch <='z'){
                    while (ch >= 'a' && ch <='z')nextChar();
                    String func = str.substring(starPost, this.pos);
                    if (eat('(')) {
                        X = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        X = parseFactor();
                    }
                    if (func.equals("sin")) X=Math.sin(Math.toRadians(X));
                    else if (func.equals("cos")) X=Math.cos(Math.toRadians(X));
                    else if (func.equals("tan")) X=Math.tan(Math.toRadians(X));
                    else if (func.equals("log")) X=Math.log10(X);
                    else if (func.equals("ln")) X=Math.log(X);
                    else if (func.equals("sqrt")) X= Math.sqrt(X);
                    else if (func.equals("!")) {
                        int facto = 1;
                        double numero = X;
                        for (int i = 1; i <= numero; i++) {
                            facto *= i;
                        }
                        X = facto;
                    }else throw new RuntimeException("Unknown error " + func);
                }else {
                    throw new RuntimeException("Error:" + (char)ch);
                }
                if (eat('^'))X=Math.pow(X,parseFactor());
                return X;
            }
        }.parse();
    }

}