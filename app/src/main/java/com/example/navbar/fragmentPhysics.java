package com.example.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragmentPhysics extends Fragment {
    private Button Physics_btn1;
    private Button Physics_btn2;
    private Button Physics_btn3;
    private Button Physics_btn4;
    private Button Physics_btn5;
    private Button Physics_btn6;
    private Button Physics_btn7;
    private Button Physics_btn8;
    private Button Physics_btn9;
    private Button Physics_btn10;
    private Button Physics_btn11;
    private Button Physics_btn12;
    private Button Physics_btn13;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_physics, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Physics_btn1 = (Button) view.findViewById(R.id.Physics_btn1);
        Physics_btn1.getBackground().setAlpha(64);
        Physics_btn2 = (Button) view.findViewById(R.id.Physics_btn2);
        Physics_btn2.getBackground().setAlpha(64);
        Physics_btn3 = (Button) view.findViewById(R.id.Physics_btn3);
        Physics_btn3.getBackground().setAlpha(64);
        Physics_btn4 = (Button) view.findViewById(R.id.Physics_btn4);
        Physics_btn4.getBackground().setAlpha(64);
        Physics_btn5 = (Button) view.findViewById(R.id.Physics_btn5);
        Physics_btn5.getBackground().setAlpha(64);
        Physics_btn6 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn6.getBackground().setAlpha(64);
        Physics_btn7 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn7.getBackground().setAlpha(64);
        Physics_btn8 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn8.getBackground().setAlpha(64);
        Physics_btn9 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn9.getBackground().setAlpha(64);
        Physics_btn10 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn10.getBackground().setAlpha(64);
        Physics_btn11 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn11.getBackground().setAlpha(64);
        Physics_btn12 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn12.getBackground().setAlpha(64);
        Physics_btn13 = (Button) view.findViewById(R.id.Physics_btn6);
        Physics_btn13.getBackground().setAlpha(64);

        Physics_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openPhysicsPage1();         //function for opening page
            }
        });

        Physics_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage2();   //function for opening page
            }

        });

        Physics_btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage3(); // function for opening page
            }
        });
        Physics_btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage4(); // function for opening page
            }
        });
        Physics_btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage5(); // function for opening page
            }
        });
        Physics_btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage6(); // function for opening page
            }
        });
        Physics_btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage7(); // function for opening page
            }
        });
        Physics_btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage8(); // function for opening page
            }
        });
        Physics_btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage9(); // function for opening page
            }
        });
        Physics_btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage10(); // function for opening page
            }
        });
        Physics_btn11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage11(); // function for opening page
            }
        });
        Physics_btn12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage12(); // function for opening page
            }
        });
        Physics_btn13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPhysicsPage13(); // function for opening page
            }
        });
    }

    public void openPhysicsPage1(){         //Not really sure how this work will have to look into it
        Intent intent = new Intent(getActivity(), mechanics_page.class);
        startActivity(intent);
    }

    public void openPhysicsPage2(){
        Intent intent = new Intent(getActivity(),elec_page.class);
        startActivity(intent);
    }
    public void openPhysicsPage3(){
        Intent intent = new Intent(getActivity(),light_page.class);
        startActivity(intent);
    }
    public void openPhysicsPage4() {

        Intent intent = new Intent(getActivity(), uvast_calc.class);
        startActivity(intent);
    }
    public void openPhysicsPage5() {

        Intent intent = new Intent(getActivity(), physics_experiments_homepage.class);
        startActivity(intent);
    }
    public void openPhysicsPage6() {

        Intent intent = new Intent(getActivity(), lens_calc.class);
        startActivity(intent);
    }
    public void openPhysicsPage7() {

        Intent intent = new Intent(getActivity(), conservation_of_momentum.class);
        startActivity(intent);
    }
    public void openPhysicsPage8() {

        Intent intent = new Intent(getActivity(), gravity_page.class);
        startActivity(intent);
    }
    public void openPhysicsPage9() {

        Intent intent = new Intent(getActivity(), OhmLawCalc.class);
        startActivity(intent);
    }
    public void openPhysicsPage10() {

        Intent intent = new Intent(getActivity(), physics_experiments_homepage.class);
        startActivity(intent);
    }
    public void openPhysicsPage11() {

        Intent intent = new Intent(getActivity(), Physics_page.class);
        startActivity(intent);
    }
    public void openPhysicsPage12() {

        Intent intent = new Intent(getActivity(), units_page.class);
        startActivity(intent);
    }
    public void openPhysicsPage13() {

        Intent intent = new Intent(getActivity(), SI_Units_page.class);
        startActivity(intent);
    }
}