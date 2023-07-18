package org.weatherApplication;

public class Constants {
    public static final String COORDINATES = "coordinates" ;
    public static final String GOOGLE_HOME_URL = "https://google.com" ;
    public static final String GOOGLE_AGREE = "L2AGLb" ;
    public static final String GOOGLE_SEARCH_BOX = "q" ;

    public static final String GOOGLE_SEARCH_BUTTON = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]" ;

    public static final String FIRST_SEARCH_RESULT = "yuRUbf" ;
    public static final String TABLE_BODY_XPATH = "/html/body/main/div[2]/div[2]/div[2]/table/tbody";
    public static final String LAT_XPATH = "/html/body/main/div[2]/div[2]/div[2]/table/tbody/tr[2]/td";
    public static final String LONG_XPATH = "/html/body/main/div[2]/div[2]/div[2]/table/tbody/tr[3]/td";
    public static final String BASE_API_URL = "https://api.open-meteo.com";
    public static final String API_VERSION_ONE = "/v1/forecast";
    public static final String LAT_PARAM_KEY = "latitude=";
    public static final String LONG_PARAM_KEY = "longitude=";
    public static final String REQ_DIVIDER = "&";
    public static final String QUERY_DIVIDER = "?";
    public static final String HOURLY_KEY_VALUE = "hourly=temperature_2m";
    public static final String TIME_KEY = "time";
    public static final String TEMP_KEY = "temperature_2m";
    public static final String BIG_ERROR = "SOMETHING TERRIBLY WRONG HAPPENED!";
}
