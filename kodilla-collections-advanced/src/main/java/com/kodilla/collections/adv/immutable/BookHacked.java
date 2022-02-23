package com.kodilla.collections.adv.immutable;

class BookHacked extends Book {
    private String realTitle;

    public BookHacked(String author, String title) {
        super(author, title);
        realTitle = title;
    }

    public void modifyTitle(String newTitle) { realTitle = newTitle; }

    @Override
    public String getTitle() {
        return realTitle;
    }
}

//package com.kodilla.collections.adv.immutable;

//class BookHacked extends Book {
    //public BookHacked(String author, String title) {
        //super(author, title);
    //}

    //public void modifyTitle(String newTitle) {
        //title = newTitle;
    //}
//}

//package com.kodilla.collections.adv.immutable;

//class BookHacked extends Book {
    //private String realTitle;

    //public BookHacked(String author, String title) {
        //super(author, title);
        //realTitle = title;
    //}

    //public void modifyTitle(String newTitle) { realTitle = newTitle; }

    //@Override
    //public String getTitle() {
        //return realTitle;
    //}
//}