package com.example.debar.eatandfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FitnessCheck extends AppCompatActivity {

    TextView menBox, womenBox;
    String men = "Height  weight(pound)\n"+
            "5'2\"-131-141\n" +
            "5'3\"-133-143\n" +
            "5'4\"-135-145\n" +
            "5'5\"-137-148\n" +
            "5'6\"-139-151\n" +
            "5'7\"-142-154\n" +
            "5'8\"-145-157\n" +
            "5'9\"-148-160\n" +
            "5'10\"-151-163\n" +
            "5'11\"-154-166\n" +
            "6'0\"-157-170\n" +
            "6'1\"-160-174\n" +
            "6'2\"-164-178\n" +
            "6'3\"-167-182\n" +
            "6'4\"-171-187\n" +
            "\n";
    String women = "Height  Weight(Pound)\n"+
            "4.10-109-121\n" +
            "4.11-111-123\n" +
            "5.0-113-126\n" +
            "5.1-115-129\n" +
            "5.2-118-132\n" +
            "5.3-121-135\n" +
            "5.4-124-138\n" +
            "5.5-127-141\n" +
            "5.6-130-144\n" +
            "5.7-133-147\n" +
            "5.8-136-150\n" +
            "5.9-139-153\n" +
            "5.10-142-156\n" +
            "5.11-145-159\n" +
            "6.0-148-162\n" +
            "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_check);
        menBox = (TextView) findViewById(R.id.Men_info);
        menBox.setText(men);
        womenBox = (TextView) findViewById(R.id.Women_info);
        womenBox.setText(women);
    }
}
