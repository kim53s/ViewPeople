package finalproject.viewpeople;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button mRefreshButton;
   // private DiningHalls mDiningHalls;
    private DrawingView mView;
    private UpdatePopulation mUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUpdate = new UpdatePopulation();
        mUpdate.updateDiningHalls();

        RelativeLayout ll = (RelativeLayout) findViewById(R.id.activity_main);

        mView = new DrawingView(this, mUpdate);
        ll.addView(mView);

        mRefreshButton = (Button) findViewById(R.id.refresh);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUpdate.updateDiningHalls();
                mView.invalidate();
            }
        };
        mRefreshButton.setOnClickListener(listener);
    }

}
