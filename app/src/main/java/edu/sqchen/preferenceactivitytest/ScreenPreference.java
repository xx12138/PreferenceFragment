package edu.sqchen.preferenceactivitytest;

import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScreenPreference extends PreferenceActivity {

    private CheckBoxPreference toogleBoxPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.another_preferences);
        initPreferences();
    }

    private void initPreferences() {
        toogleBoxPreference = (CheckBoxPreference) findPreference(SettingConfigs.TOOGLE_BOX_KEY);
    }

}
