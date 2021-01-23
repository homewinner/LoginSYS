package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tfail1 = Toast.makeText(applicationContext,"Please don't enter same username and password.",Toast.LENGTH_LONG)
        val tfail2 = Toast.makeText(applicationContext,"Password in both fields is different.",Toast.LENGTH_LONG)
        val tfail3 = Toast.makeText(applicationContext,"Please fill the empty fields.",Toast.LENGTH_LONG)
        val tsuccess = Toast.makeText(applicationContext,"Register successful.",Toast.LENGTH_LONG)
        val tclear = Toast.makeText(applicationContext,"All fields are empty.",Toast.LENGTH_LONG)

        bt1.setOnClickListener(){
            if (this.user.text.toString() == "" || this.pw.text.toString() == "" || this.cf.text.toString() == ""){
                tfail3.show()
            }
            else{
                if (this.user.text.toString() == this.pw.text.toString() || this.user.text.toString() == this.cf.text.toString()
                        || this.user.text.toString() == this.pw.text.toString() && this.user.text.toString() == this.cf.text.toString()){
                    tfail1.show()
                }
                else if (this.pw.text.toString() == this.cf.text.toString()){
                    tsuccess.show()
                }
                else{
                    tfail2.show()
                }
            }
        }

        bt2.setOnClickListener(){
            user.setText(null)
            pw.setText(null)
            cf.setText(null)
            tclear.show()
        }
    }
}