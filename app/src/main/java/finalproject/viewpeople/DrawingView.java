package finalproject.viewpeople;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


/**
 * Created by Sujin on 12/12/2016.
 */

public class DrawingView extends View {

    private UpdatePopulation mUpdate;

    public DrawingView(Context context, UpdatePopulation update) {
        super(context);
        this.mUpdate = update;
    }

    public void color(Paint paint, int ppl)
    {
        if(ppl <= 30)
            paint.setColor(Color.parseColor("#2a87d3"));
        else if(ppl <= 50)
            paint.setColor(Color.parseColor("#67c66f"));
        else if(ppl <= 70)
            paint.setColor(Color.parseColor("#f4e542"));
        else if(ppl <= 100)
            paint.setColor(Color.parseColor("#f48c42"));
        else
            paint.setColor(Color.RED);
    }

    public int radius(int ppl)
    {
        if(ppl==0)
            return 0;
        else if(ppl <= 10)
            return 60;
        else if(ppl <= 20)
            return 70;
        else if(ppl <= 30)
            return 80;
        else if(ppl <= 50)
            return 100;
        else if(ppl <= 70)
            return 120;
        else if(ppl <= 80)
            return 140;
        else if(ppl <= 90)
            return 160;
        else if(ppl == 100)
            return 170;
        else
            return 180;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(22);
        paint.setAntiAlias(true);

        //Abbey
        canvas.drawCircle(290, 490, 170, paint);
        //Rocky
        canvas.drawCircle(800, 490, 170, paint);
        //Wilder
        canvas.drawCircle(290, 1000, 170, paint);
        //Ham
        canvas.drawCircle(800, 1000, 170, paint);
        //Prospect
        canvas.drawCircle(290, 1500, 170, paint);
        //MacGregor
        canvas.drawCircle(800, 1500, 170, paint);

        //Abbey
        color(paint, mUpdate.getAbbey());
        canvas.drawCircle(290, 490, radius(mUpdate.getAbbey()), paint);

        //Rocky
        color(paint, mUpdate.getRocky());
        canvas.drawCircle(800, 490, radius(mUpdate.getRocky()), paint);

        //Wilder
        color(paint, mUpdate.getWilder());
        canvas.drawCircle(290, 1000, radius(mUpdate.getWilder()), paint);

        //Ham
        color(paint, mUpdate.getHam());
        canvas.drawCircle(800, 1000, radius(mUpdate.getHam()), paint);

        //Prospect
        color(paint, mUpdate.getProspect());
        canvas.drawCircle(290, 1500, radius(mUpdate.getProspect()), paint);

        //MacGregor
        color(paint, mUpdate.getMac());
        canvas.drawCircle(800, 1500, radius(mUpdate.getMac()), paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(100);
        //Prospect
        String num = Integer.toString(mUpdate.getProspect());
        canvas.drawText(num, 220, 1535, paint);
        //Abbey
        num = Integer.toString(mUpdate.getAbbey());
        canvas.drawText(num, 220, 525, paint);
        // Wilder
        num = Integer.toString(mUpdate.getWilder());
        canvas.drawText(num, 220, 1035, paint);
        // Rocky
        num = Integer.toString(mUpdate.getRocky());
        canvas.drawText(num, 730, 525, paint);
        // Ham
        num = Integer.toString(mUpdate.getHam());
        canvas.drawText(num, 730, 1035, paint);
        // Mac
        num = Integer.toString(mUpdate.getMac());
        canvas.drawText(num, 730, 1535, paint);

    }
}
