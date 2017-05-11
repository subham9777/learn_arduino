package com.example.snehitsagi.learn_arduino;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

;

public class BlankFragment2 extends Fragment {

    public BlankFragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.test_tab, container, false);

        RecyclerView rv2 = (RecyclerView) rootView.findViewById(R.id.recyclerView2);
        rv2.setHasFixedSize(true);
        /**
         * Changed by Subham, added another parameter
         */
        MyAdapter adapter2 = new MyAdapter(new String[]{"01", "02", "03"},
                new String[]{"Begginers Test","Commands Test","Rookie Test"},
                new String[]{"Question 1 \n\nSerial pins on arduino are \n\n a. D0 and D1 \t\t b. D3 and D6 \n c. D8 and D5 \t\t d. D3 and D9\n\nQuestion 2 \n\nOn board led on arduino is attach to which digital pin\n\n a. D3 \t\t\t\t\t b. D6 \n c. D8 \t\t\t\t\t d. D13\n\nQuestion 3 \n\nWhat are voltage outputs the board can provide to sensors?\n\n a. 3.3v & 5v \t\t\t\t\t b. 4v & 7v \n c. 5v & 6v \t\t\t\t\t d. 3.3v & 6v\n\nQuestion 4 \n\nPWM stands for?\n\n a. Pulse Width Modulation \n b. Pulse Wide Modulation \n c. Pulse Width Modulate \n d. Pin Width Modulation\n\nQuestion 5 \n\nWhich is not a PWM pin on Arduino Uno? \n\n a. D3 \t\t b. D6 \n c. D8 \t\t d. D5\n\nQuestion 6 \n\nWhich pins are used to interconnect multiple arduino boards? \n\n a. D0 & D1 \t\t b. D0 & D6 \n c. D8 & D9 \t\t d. D5 & D8\n\nQuestion 7 \n\nWhat are the main segments available in arduino program? \n\n a. Void Setup & Void Loop \n b. Void Setup \n c. Void Main \n d. Void for loop\n\nQuestion 8 \n\nWhat does push button used for? \n\n a. reset \t\t b. format \n c. restart \t\t d. None of these\n\nQuestion 9 \n\nOn board led on arduino is attach to which digital pin? \n\n a. D2 \t\t b. D13 \n c. D6 \t\t d. None of these\n\nQuestion 10 \n\nCan arduino work on any external battery? \n\n a. No \t\t b. Yes \n c. Maybe \t\t d. None of these\n\n\n\n\n\n\n\n Answer Key:- \n\n 1 - a \t\t 2 - d \t\t 3 - a \t\t 4 - a \t\t 5 - c\n6 - a \t\t 7 - a \t\t 8 - a \t\t 9 - b \t\t 10 - b",
                        "Question 1 \n\nHow many attributes are required for mapping the analog values? \n\n a. 4 \t\t b. 5 \n c. 8 \t\t d. None of these\n\nQuestion 2 \n\nThe delay provided in the delay function is in which unit?\n\n a. seconds \t\t\t\t\t b. milli-seconds \n c. minutes \t\t\t\t\t d. hours\n\nQuestion 3 \n\nWhat is the default baud rate set in Arduino IDE?\n\n a. 9100 \t\t\t\t\t b. 9600 \n c. 9750 \t\t\t\t\t d. 11000\n\nQuestion 4 \n\nSerial library command used to check the data available or not\n\n a. Serial.open() \n b. Serial.available() \n c. Serial.isavailable() \n d. None of these\n\nQuestion 5 \n\nWhich function is used toregulate analog inputs? \n\n a. map \t\t b. trace \n c. analog \t\t d. None of these\n\nQuestion 6 \n\nWhile using Wire library the address can be selected  between the range of? \n\n a. 0-200 \t\t b. 0-225 \n c. 0-255 \t\t d. None of these\n\nQuestion 7 \n\nUsing Wire library the command used to receive data is? \n\n a. Wire.recieve() \n b. Wire.get() \n c. Wire.onRecieve() \n d. None of these\n\nQuestion 8 \n\nHow many times void loop() runs? \n\n a. 100 \t\t b. 9800 \n c. infinite \t\t d. None of these\n\nQuestion 9 \n\nHow do you assign a pin status? \n\n a. pinMode() \t\t b. pin() \n c. pinmode() \t\t d. None of these\n\nQuestion 10 \n\nIs programming in arduino IDE case sensitive? \n\n a. No \t\t b. Yes \n c. Maybe \t\t d. None of these\n\n\n\n\n\n\n\n Answer Key:- \n\n 1 - b \t\t 2 - b \t\t 3 - b \t\t 4 - b \t\t 5 - a\n6 - c \t\t 7 - c \t\t 8 - c \t\t 9 - a \t\t 10 - b",
                        "Question 1 \n\nLibrary used for running a servo motor is \n\n a. Servo \t\t b. Servo motor \n c. Motor \t\t d. None of these\n\nQuestion 2 \n\nFunction used for fixing the range of any analog element is ?\n\n a. constant \t\t\t\t\t b. constraint \n c. const \t\t\t\t\t d. None of these\n\nQuestion 3 \n\nBaud rate setup for using led or oled screen is?\n\n a. 9600 \t\t\t\t\t b. 10000 \n c. 11600 \t\t\t\t\t d. None of these\n\nQuestion 4 \n\n For using high voltage devices with arduino like TV, or Lamp can be done using?\n\n a. Relay switches \n b. Simple switches \n c. Modulators \n d. None of these\n\nQuestion 5 \n\nAttributes required in “constrain” function are? \n\n a. 2 \t\t b. 3 \n c. 5 \t\t d. None of these\n\nQuestion 6 \n\nMultitasking in arduino is done using? \n\n a. Interrupts \t\t b. Switching \n c. Breaks\t\t d. None of these\n\nQuestion 7 \n\nWhile using I2c communication how many devices can be connected on data and clock line? \n\n a. 200 \n b. 250 \n c. 255 \n d. None of these\n\nQuestion 8 \n\nLibrary used for setting up a HTTP web client? \n\n a. GSM.h \t\t b. GSM \n c. CDMA.h \t\t d. None of these\n\nQuestion 9 \n\nWhile using bluetooth module pins used for sending and receiving data are? \n\n a. TX \t\t b. RX \n c. both a & b \t\t d. None of these\n\nQuestion 10 \n\nDuring writing program body can new pins be initialized and used in void loop() immediately? \n\n a. No \t\t b. Yes \n c. Maybe \t\t d. None of these\n\n\n\n\n\n\n\n Answer Key:- \n\n 1 - a \t\t 2 - b \t\t 3 - c \t\t 4 - a \t\t 5 - b\n6 - a \t\t 7 - c \t\t 8 - a \t\t 9 - c \t\t 10 - a"},
                rootView.getContext());
        rv2.setAdapter(adapter2);

        LinearLayoutManager llm2 = new LinearLayoutManager(getActivity());
        rv2.setLayoutManager(llm2);

        return rootView;
    }

}