package com.example.debar.eatandfit;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HealthTips extends AppCompatActivity {

   private TextView text1;

    String health = "Health Tips:\n" +
            "There are many ways to lose a lot of weight fast.\n" +
            "However, most of them will make you hungry and unsatisfied.\n" +
            "If you don’t have iron willpower, then hunger will cause you to give up on these plans quickly.\n" +
            "The plan outlined here will:\n" +
            "•\t1. Reduce your appetite significantly.\n" +
            "•\t2. Make you lose weight quickly, without hunger.\n" +
            "•\t3. Improve your metabolic health at the same time.\n" +
            "Ways to lose weight:\n" +
            "•\tOpt for low sugar products and use fresh or frozen ingredients instead of canned goods whenever possible.\n" +
            "•\tSoft drinks (including soda, energy drinks, shakes, and coffee drinks) are one of the biggest sources of hidden sugar. One can of soda or a medium shake can contain between 10-12 teaspoons of added sugar.\n" +
            "•\tSwitching to diet soda isn’t the answer as it can trigger sugar cravings and contributes to weight gain. Instead, try switching to carbonated water with a splash of juice or unsweetened iced tea.\n" +
            "•\tBy slowly reducing the sugar in your diet a little at a time, you’ll give your taste buds time to adjust and be able to wean yourself off the craving for sweets.\n" +
            "•\tTo avoid unhealthy spikes in blood sugar, avoid refined carbs such as white bread, white rice or pasta, and opt for their whole-grain counterparts instead.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);

        text1 = (TextView) findViewById(R.id.HtextID);

        text1.setText(health);
    }
}
