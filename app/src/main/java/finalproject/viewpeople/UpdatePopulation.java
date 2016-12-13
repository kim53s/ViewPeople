package finalproject.viewpeople;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.google.android.gms.internal.zzs.TAG;

/**
 * Created by Sujin on 12/12/2016.
 */

public class UpdatePopulation {
    private int mProspect;
    private int mAbbey;
    private int mHam;
    private int mWilder;
    private int mRocky;
    private int mMac;

    private DatabaseReference mDatabase;

    public UpdatePopulation()
    {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        updateDiningHalls();
    }

    public void updateDiningHalls()
    {
        mDatabase.child("Prospect").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        int p = ((Long) dataSnapshot.getValue()).intValue();
                        mProspect = p;
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "load:onCancelled", databaseError.toException());
                        // ...
                    }
                });

        mDatabase.child("Abbey").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        int p = ((Long) dataSnapshot.getValue()).intValue();
                        mAbbey = p;
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "load:onCancelled", databaseError.toException());
                        // ...
                    }
                });

        mDatabase.child("Wilder").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        int p = ((Long) dataSnapshot.getValue()).intValue();
                        mWilder = p;
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "load:onCancelled", databaseError.toException());
                        // ...
                    }
                });

        mDatabase.child("Ham").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        int p = ((Long) dataSnapshot.getValue()).intValue();
                        mHam = p;
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "load:onCancelled", databaseError.toException());
                        // ...
                    }
                });

        mDatabase.child("Mac").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        int p = ((Long) dataSnapshot.getValue()).intValue();
                        mMac = p;
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "load:onCancelled", databaseError.toException());
                        // ...
                    }
                });

        mDatabase.child("Rocky").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        int p = ((Long) dataSnapshot.getValue()).intValue();
                        mRocky = p;
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "load:onCancelled", databaseError.toException());
                        // ...
                    }
                });
    }

    public int getProspect()
    {
        return mProspect;
    }

    public int getAbbey()
    {
        return mAbbey;
    }

    public int getWilder()
    {
        return mWilder;
    }

    public int getHam()
    {
        return mHam;
    }

    public int getMac()
    {
        return mMac;
    }

    public int getRocky()
    {
        return mRocky;
    }
}
