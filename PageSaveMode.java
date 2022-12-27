public class PageSaveMode extends PrintMode{
    public int NumberOfPage = getNumberOfPages();
    public void saveToner() {

    }

    @Override
    public void savePage() {
        if(getPageSize().equals("A5") && getOrientation()>10)
        {
            System.out.println("Required number of pages are: "+NumberOfPage--);
        }
    else {
            System.out.println("Required number of pages are: " + NumberOfPage);
        }
    }

    @Override
    public void boost() {

    }
    public void renderPreview() {
        System.out.println("The updated document is showed");
    }

}
