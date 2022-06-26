package valdezet.budgetizemobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setupBottomNavigation();
    }

    protected void setupBottomNavigation() {
        NavHostFragment appNavHost = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navhost_main_app);
        // remove warning from IntelliJ IDE.
        // I think during normal operation, `getNavController` won't ever return null
        assert appNavHost != null;
        NavController appNavController = appNavHost.getNavController();
        BottomNavigationView appBottomNav = findViewById(R.id.bottomnav_main_app);
        NavigationUI.setupWithNavController(appBottomNav, appNavController);
    }
}