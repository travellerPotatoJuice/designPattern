package org.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 文件夹类
 */
public class Directory extends Entry{

    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        super(name);
    }

    /**
     * 向文件夹中添加文件
     * @param entry
     * @return
     */
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    /**
     * 获取文件夹中所有entry的大小
     * @return
     */
    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }


    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.printList(prefix+"/"+name);
        }
    }


}
