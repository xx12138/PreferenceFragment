package edu.sqchen.preferenceactivitytest;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;

/**
 * Created by Administrator on 2017/4/16.
 */

public class SettingsActivity extends PreferenceActivity {

    private CheckBoxPreference mBoxPreference;

    private EditTextPreference mEditPreference;

    private ListPreference mListPreference;

    private Preference anotherScreen;

    private Preference intentWeb;

    private CheckBoxPreference parentBoxPreference;

    private CheckBoxPreference childBoxPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        initPreferences();
    }

    private void initPreferences() {
        mBoxPreference = (CheckBoxPreference) findPreference(SettingConfigs.CHECKBOX_KEY);
        mEditPreference = (EditTextPreference) findPreference((SettingConfigs.EDIT_KEY));
        mListPreference = (ListPreference) findPreference(SettingConfigs.LIST_KEY);
        anotherScreen = (Preference) findPreference(SettingConfigs.ANOTHER_SCREEN);
        intentWeb = (Preference) findPreference(SettingConfigs.INTENT_WEB);
        parentBoxPreference = (CheckBoxPreference) findPreference(SettingConfigs.PARENT_BOX_KEY);
        childBoxPreference = (CheckBoxPreference) findPreference(SettingConfigs.CHILD_BOX_KEY);
    }

}
