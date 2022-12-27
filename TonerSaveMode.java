public class TonerSaveMode extends PrintMode{
    public String tonerSavingLevel;

    public TonerSaveMode(String tonerSavingLevel) {
        this.tonerSavingLevel= tonerSavingLevel;
    }

    @Override
    public void saveToner() {
        if(tonerSavingLevel.equals("high"))
        {
            ifTonerSavingLevelIsHigh();
        }
        else if (tonerSavingLevel.equals("medium"))
        {
            ifTonerSavingLevelIsMedium();
        }
        else if (tonerSavingLevel.equals("low"))
        {
            ifTonerSavingLevelIsLow();
        }

    }

    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }

    public void ifTonerSavingLevelIsHigh() {
        System.out.println("HIGH and Color intensity is reduced by 80%");
    }
    public void ifTonerSavingLevelIsMedium() {
        System.out.println("MEDIUM and Color intensity is reduced by 60%");
    }
    public void ifTonerSavingLevelIsLow() {
        System.out.println("LOW and Color intensity is reduced by 40%");
    }

}
