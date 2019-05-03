package com.dustinbowman.utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The type Paginate list.
 *
 * @param <T> the type parameter
 */
public class PaginateList<T> {

    private static final int DEFAULT_PAGE_SIZE = 10;

    private List<T> list;
    private List<List<T>> listOfPages;
    private int pageSize = DEFAULT_PAGE_SIZE;
    private int currentPage = 0;

    /**
     * Instantiates a new Paginate list.
     *
     * @param list the list
     */
    public PaginateList(List<T> list) {
        this.list = list;
        initPages();
    }

    /**
     * Instantiates a new Paginate list.
     *
     * @param list     the list
     * @param pageSize the page size
     */
    public PaginateList(List<T> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
        initPages();
    }

    /**
     * Gets page.
     *
     * @param pageNumber the page number
     * @return the page
     */
    public List<T> getPage(int pageNumber) {
        if (listOfPages == null ||
                pageNumber > listOfPages.size() ||
                pageNumber < 1) {
            return Collections.emptyList();
        }

        currentPage = pageNumber;
        return listOfPages.get(--pageNumber);
    }

    /**
     * Number of pages int.
     *
     * @return the int
     */
    public int numberOfPages() {
        if (listOfPages == null) {
            return 0;
        }

        return listOfPages.size();
    }

    /**
     * Next page list.
     *
     * @return the list
     */
    public List<T> nextPage() {
        return getPage(++currentPage);
    }

    /**
     * Previous page list.
     *
     * @return the list
     */
    public List<T> previousPage() {
        return getPage(--currentPage);
    }

    /**
     * Init pages.
     */
    public void initPages() {
        if (list == null || listOfPages != null) {
            return;
        }

        if (pageSize <= 0 || pageSize > list.size()) {
            pageSize = list.size();
        }

        int numOfPages = (int) Math.ceil((double) list.size() / (double) pageSize);
        listOfPages = new ArrayList<List<T>>(numOfPages);
        for (int pageNum = 0; pageNum < numOfPages; ) {
            int from = pageNum * pageSize;
            int to = Math.min(++pageNum * pageSize, list.size());
            listOfPages.add(list.subList(from, to));
        }
    }
}