package com.example.mohammedabdullah3296.helpme;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * The configuration screen for the {@link NewsAppWidget NewsAppWidget} AppWidget.
 */
public class NewsAppWidgetConfigureActivity extends Activity {

    private static final String PREFS_NAME = "com.example.mohammedabdullah3296.helpme.NewsAppWidget";
    private static final String PREF_PREFIX_KEY = "appwidget_";
    int mAppWidgetId = AppWidgetManager.INVALID_APPWIDGET_ID;
    EditText mAppWidgetText;
    View.OnClickListener generalNewsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.general_url1)
                    + context.getString(R.string.one) + context.getString(R.string.general_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };
    private View.OnClickListener travel_newsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.travel_url1)
                    + context.getString(R.string.one) + context.getString(R.string.travel_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };
    private View.OnClickListener business_newsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.business_url1)
                    + context.getString(R.string.one) + context.getString(R.string.business_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };
    private View.OnClickListener money_newsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.money_url1)
                    + context.getString(R.string.one) + context.getString(R.string.money_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };
    private View.OnClickListener technology_newsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.technology_url1)
                    + context.getString(R.string.one) + context.getString(R.string.technology_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };
    private View.OnClickListener science_newsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.science_url1)
                    + context.getString(R.string.one) + context.getString(R.string.science_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };
    private View.OnClickListener sports_newsOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            final Context context = NewsAppWidgetConfigureActivity.this;

            // When the button is clicked, store the string locally
            String widgetText = context.getString(R.string.sports_url1)
                    + context.getString(R.string.one) + context.getString(R.string.sports_url2);
            saveTitlePref(context, mAppWidgetId, widgetText);

            // It is the responsibility of the configuration activity to update the app widget
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            NewsAppWidget.updateAppWidget(context, appWidgetManager, mAppWidgetId);

            // Make sure we pass back the original appWidgetId
            Intent resultValue = new Intent();
            resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
            setResult(RESULT_OK, resultValue);
            finish();
        }
    };

    public NewsAppWidgetConfigureActivity() {
        super();
    }

    // Write the prefix to the SharedPreferences object for this widget
    static void saveTitlePref(Context context, int appWidgetId, String text) {
        SharedPreferences.Editor prefs = context.getSharedPreferences(PREFS_NAME, 0).edit();
        prefs.putString(PREF_PREFIX_KEY + appWidgetId, text);
        prefs.apply();
    }

    // Read the prefix from the SharedPreferences object for this widget.
    // If there is no preference saved, get the default from a resource
    public static String loadTitlePref(Context context, int appWidgetId) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        String titleValue = prefs.getString(PREF_PREFIX_KEY + appWidgetId, null);
        if (titleValue != null) {
            return titleValue;
        } else {
            return context.getString(R.string.general_url1)
                    + context.getString(R.string.one)
                    + context.getString(R.string.general_url2);
        }
    }

    static void deleteTitlePref(Context context, int appWidgetId) {
        SharedPreferences.Editor prefs = context.getSharedPreferences(PREFS_NAME, 0).edit();
        prefs.remove(PREF_PREFIX_KEY + appWidgetId);
        prefs.apply();
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        // Set the result to CANCELED.  This will cause the widget host to cancel
        // out of the widget placement if the user presses the back button.
        setResult(RESULT_CANCELED);

        setContentView(R.layout.news_app_widget_configure);

//        mAppWidgetText = (EditText) findViewById(R.id.appwidget_text);
        findViewById(R.id.general_news).setOnClickListener(generalNewsOnClickListener);
        findViewById(R.id.business_news).setOnClickListener(business_newsOnClickListener);
        findViewById(R.id.money_news).setOnClickListener(money_newsOnClickListener);
        findViewById(R.id.technology_news).setOnClickListener(technology_newsOnClickListener);
        findViewById(R.id.science_news).setOnClickListener(science_newsOnClickListener);
        findViewById(R.id.sports_news).setOnClickListener(sports_newsOnClickListener);
        findViewById(R.id.travel_news).setOnClickListener(travel_newsOnClickListener);

        // Find the widget id from the intent.
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            mAppWidgetId = extras.getInt(
                    AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
        }

        // If this activity was started with an intent without an app widget ID, finish with an error.
        if (mAppWidgetId == AppWidgetManager.INVALID_APPWIDGET_ID) {
            finish();
            return;
        }

        // mAppWidgetText.setText(loadTitlePref(NewsAppWidgetConfigureActivity.this, mAppWidgetId));
    }
}

