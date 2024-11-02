public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City() {}

    public City(String cityName, String regionName, String countryName,
                int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    @Override
    public String toString() {
        return "Місто [Назва: " + cityName + ",\nРегіон: " + regionName +
                ",\nКраїна: " + countryName + ",\nКількість жителів: " + population +
                ",\nПоштовий індекс: " + postalCode + ",\nТелефонний код: " + phoneCode + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return true;
        return toString().equals(((City)obj).toString());
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
