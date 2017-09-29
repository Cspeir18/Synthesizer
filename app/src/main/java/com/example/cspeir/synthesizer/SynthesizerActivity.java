package com.example.cspeir.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;

import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {


    private final int WHOLE_NOTE = 2000;
    private Button fButton;
    private Button eButton;
    private Button challengeOne;
    private Button challengeTwo;
    private Button challengeFive;
    private Button jingleBell;


    private CheckBox secondLine;


    private static final String TAG = SynthesizerActivity.class.getName();
    private NumberPicker notePicker;
    private NumberPicker repeatPicker;
    MediaPlayer mpE;
    MediaPlayer mpF;
    MediaPlayer mpFS;
    MediaPlayer mpG;
    MediaPlayer mpA;
    MediaPlayer mpB;
    MediaPlayer mpD;
    MediaPlayer mpCS;
    MediaPlayer mpBB;
    MediaPlayer mpC;
    MediaPlayer mpDS;
    MediaPlayer mpGS;
    MediaPlayer mpHighE;
    MediaPlayer mpHighF;
    MediaPlayer mpHighFS;
    MediaPlayer mpHighG;
    String[] notes = {"mpFS","mpF", "mpG", "mpD", "mpCS", "mpA", "mpB", "mpE", "mpBB", "mpC", "mpDS", "mpGS", "mpHighE", "mpHighF", "mpHighFS", "mpHighG"};
    ArrayList<MediaPlayer> mediaplayers;
    ArrayList<MediaPlayer>eToE;
    ArrayList<MediaPlayer>twinkle;
    ArrayList<MediaPlayer>twinkleSecondLine;
    ArrayList<MediaPlayer>jingleBells;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        jingleBell = (Button)findViewById(R.id.button6);
        challengeOne = (Button)findViewById(R.id.button3);
        challengeTwo = (Button)findViewById(R.id.button4);
        challengeFive = (Button)findViewById(R.id.button5);
        repeatPicker = (NumberPicker)findViewById(R.id.numberPicker);
        notePicker = (NumberPicker)findViewById(R.id.numberPicker2);
        secondLine= (CheckBox)findViewById(R.id.checkBox);
        repeatPicker.setMinValue(0);
        repeatPicker.setMaxValue(20);
        notePicker.setMinValue(0);
        notePicker.setMaxValue(15);
        notePicker.setDisplayedValues(notes);

        fButton = (Button)findViewById(R.id.button1);
        eButton = (Button)findViewById(R.id.button2);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);
        mediaplayers = new ArrayList<>();
        eToE = new ArrayList<>();
        twinkle = new ArrayList<>();
        twinkleSecondLine = new ArrayList<>();
        jingleBells = new ArrayList<>();
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpD);
        jingleBells.add(mpG);
        jingleBells.add(mpA);
        jingleBells.add(mpB);
        jingleBells.add(mpC);
        jingleBells.add(mpC);
        jingleBells.add(mpC);
        jingleBells.add(mpC);
        jingleBells.add(mpC);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpB);
        jingleBells.add(mpA);
        jingleBells.add(mpA);
        jingleBells.add(mpB);
        jingleBells.add(mpA);
        mediaplayers.add(mpFS);
        mediaplayers.add(mpF);
        mediaplayers.add(mpG);
        mediaplayers.add(mpD);
        mediaplayers.add(mpCS);
        mediaplayers.add(mpA);
        mediaplayers.add(mpB);
        mediaplayers.add(mpE);
        mediaplayers.add(mpBB);
        mediaplayers.add(mpC);
        mediaplayers.add(mpDS);
        mediaplayers.add(mpGS);
        mediaplayers.add(mpHighE);
        mediaplayers.add(mpHighF);
        mediaplayers.add(mpHighFS);
        mediaplayers.add(mpHighG);
        eToE.add(mpE);
        eToE.add(mpFS);
        eToE.add(mpG);
        eToE.add(mpA);
        eToE.add(mpB);
        eToE.add(mpCS);
        eToE.add(mpD);
        eToE.add(mpE);
        twinkle.add(mpA);
        twinkle.add(mpA);
        twinkle.add(mpHighE);
        twinkle.add(mpHighE);
        twinkle.add(mpHighFS);
        twinkle.add(mpHighFS);
        twinkle.add(mpHighE);
        twinkle.add(mpD);
        twinkle.add(mpD);
        twinkle.add(mpCS);
        twinkle.add(mpCS);
        twinkle.add(mpB);
        twinkle.add(mpB);
        twinkle.add(mpA);
        twinkleSecondLine.add(mpHighE);
        twinkleSecondLine.add(mpHighE);
        twinkleSecondLine.add(mpD);
        twinkleSecondLine.add(mpD);
        twinkleSecondLine.add(mpCS);
        twinkleSecondLine.add(mpCS);
        twinkleSecondLine.add(mpB);



        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i(TAG, "This worked! Button1 pressed");
                mpF.start();
            }
        });

        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpE.start();
                delayPlaying(WHOLE_NOTE);
                mpF.start();
            }
        });
        challengeOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i =0; i<=7; i++) {

                    eToE.get(i).seekTo(0);
                    eToE.get(i).start();
                    delayPlaying(WHOLE_NOTE/2);
                    i++;
                }

            }
        });
        challengeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int note = notePicker.getValue();
                int repeat = repeatPicker.getValue();
                int i = 0;
                while (i<repeat) {
                    i++;
                    mediaplayers.get(note).seekTo(0);
                    mediaplayers.get(note).start();
                    delayPlaying(WHOLE_NOTE);
                    Log.i(TAG, "Played " + i + " times");
                }

            }
        });
        challengeFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int repeat = repeatPicker.getValue();
                for (int r = 0; r < 2 + repeat; r++) {

                    if (r == 0|| r==repeat+1) {


                        for (int i = 0; i <= 13; i++) {
                            if (i == 5 || i == 12) {
                                play(twinkle.get(i), WHOLE_NOTE / 2);


                            } else {
                                play(twinkle.get(i), WHOLE_NOTE / 4);
                            }
                        }
                    }

                     else if (secondLine.isChecked()){
                        for (int m = 0;m<6; m++){
                           play(twinkleSecondLine.get(m),WHOLE_NOTE/2);
                        }
                    }

                }
            }
        });
        jingleBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i <=22; i++){
                    if(i == 2|| i ==5|| i==23){
                        play(jingleBells.get(i), WHOLE_NOTE/2);
                    }
                    else if(i==10){
                        play(jingleBells.get(i), WHOLE_NOTE);

                    }
                    else{
                        play(jingleBells.get(i), WHOLE_NOTE/4);
                    }

                }
            }
        });

    }
    public void play(MediaPlayer tune, int delay){
        tune.seekTo(0);
        tune.start();
        delayPlaying(delay);
    }
    private void delayPlaying(int delay){
        try {
            Thread.sleep(delay);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
