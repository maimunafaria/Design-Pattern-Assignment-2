public abstract class PrintMode {
    private int numberOfPages , orientation;
    private String pageSize;
    private double colorIntensity , costPerPage;

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public void setColorIntensity(double colorIntensity) {
        this.colorIntensity = colorIntensity;
    }

    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getOrientation() {
        return orientation;
    }

    public String getPageSize() {
        return pageSize;
    }

    public double getColorIntensity() {
        return colorIntensity;
    }

    public double getCostPerPage() {
        return costPerPage;
    }

    public abstract void saveToner();
    public abstract void savePage();
    public abstract void boost();
}
