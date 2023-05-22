package com.example.mpproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.example.mpproject.databinding.ActivityHomeBinding;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
      //  binding.bottomNavigationView.setVisibility(View.GONE);

        binding.bottomNavigationView.setVisibility(View.VISIBLE);
        binding.homeL.setBackgroundResource(R.drawable.button_bc);
        binding.homeIcon.setBackgroundResource(R.drawable.ic_home_on);
        binding.homeText.setVisibility(View.VISIBLE);


        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();





        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
                String currentFragment= navController.getCurrentDestination().getLabel().toString();
                if (currentFragment.equals("HomeScreen")){;
                    binding.bottomNavigationView.setVisibility(View.VISIBLE);
                    binding.homeL.setBackgroundResource(R.drawable.button_bc);
                    binding.homeIcon.setBackgroundResource(R.drawable.ic_home_on);
                    binding.homeText.setVisibility(View.VISIBLE);
                }
            }
        });

        ScaleAnimation scaleAnimation=new ScaleAnimation(0.5f,1.0f,1f,1f,
                Animation.RELATIVE_TO_SELF,1f);

        scaleAnimation.setDuration(500);
        scaleAnimation.setFillAfter(true);

        Animation animationFadeIn= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        Animation animationFadeOut= AnimationUtils.loadAnimation(this,R.anim.fade_out);





        binding.homeIcon.setOnClickListener(view-> {
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, HomeScreen.class,null).commit();
            binding.homeL.setBackgroundResource(R.drawable.button_bc);
            binding.homeL.startAnimation(scaleAnimation);
            binding.homeIcon.setBackgroundResource(R.drawable.ic_home_on);
            binding.homeText.setVisibility(View.VISIBLE);

            binding.rankingIcon.setBackgroundResource(R.drawable.ic_ranking);
            binding.rankingL.setBackgroundResource(0);
            binding.rankingText.setVisibility(View.GONE);

            binding.communityIcon.setBackgroundResource(R.drawable.ic_community_off);
            binding.communityL.setBackgroundResource(0);
            binding.communityText.setVisibility(View.GONE);

            binding.profileIcon.setBackgroundResource(R.drawable.ic_profile_off);
            binding.profileL.setBackgroundResource(0);
            binding.profileText.setVisibility(View.GONE);

        });
        binding.rankingIcon.setOnClickListener(view-> {
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, RankingScreen.class,null).commit();
            binding.rankingL.setBackgroundResource(R.drawable.button_bc);
            binding.rankingL.startAnimation(scaleAnimation);
            binding.rankingIcon.setBackgroundResource(R.drawable.ic_ranking_on);
            binding.rankingText.setVisibility(View.VISIBLE);

            binding.homeIcon.setBackgroundResource(R.drawable.ic_home_off);
            binding.homeText.setVisibility(View.GONE);
            binding.homeL.setBackgroundResource(0);

            binding.communityIcon.setBackgroundResource(R.drawable.ic_community_off);
            binding.communityText.setVisibility(View.GONE);
            binding.communityL.setBackgroundResource(0);

            binding.profileIcon.setBackgroundResource(R.drawable.ic_profile_off);
            binding.profileText.setVisibility(View.GONE);
            binding.profileL.setBackgroundResource(0);
        });
        binding.communityIcon.setOnClickListener(view-> {
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, CommunityScreen.class,null).commit();
            binding.communityL.setBackgroundResource(R.drawable.button_bc);
            binding.communityL.startAnimation(scaleAnimation);
            binding.communityIcon.setBackgroundResource(R.drawable.ic_community_on);
            binding.communityText.setVisibility(View.VISIBLE);

            binding.rankingIcon.setBackgroundResource(R.drawable.ic_ranking);
            binding.rankingL.setBackgroundResource(0);
            binding.rankingText.setVisibility(View.GONE);

            binding.homeIcon.setBackgroundResource(R.drawable.ic_home_on);
            binding.homeL.setBackgroundResource(0);
            binding.homeText.setVisibility(View.GONE);

            binding.profileIcon.setBackgroundResource(R.drawable.ic_profile_off);
            binding.profileL.setBackgroundResource(0);
            binding.profileText.setVisibility(View.GONE);
        });
        binding.profileIcon.setOnClickListener(view-> {
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, ProfileScreen.class,null).commit();
            binding.communityL.setBackgroundResource(0);
            binding.communityIcon.setBackgroundResource(R.drawable.ic_community_off);
            binding.communityText.setVisibility(View.GONE);

            binding.rankingIcon.setBackgroundResource(R.drawable.ic_ranking);
            binding.rankingL.setBackgroundResource(0);
            binding.rankingText.setVisibility(View.GONE);

            binding.homeIcon.setBackgroundResource(R.drawable.ic_home_on);
            binding.homeL.setBackgroundResource(0);
            binding.homeText.setVisibility(View.GONE);

            binding.profileIcon.setBackgroundResource(R.drawable.ic_profile_on);
            binding.profileL.setBackgroundResource(R.drawable.button_bc);
            binding.profileL.startAnimation(scaleAnimation);
            binding.profileText.setVisibility(View.VISIBLE);

        });


    }
}