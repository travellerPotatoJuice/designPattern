package org.example;

/**
 * 文件类
 */
public class File extends Entry{

    public File(String name,int size) {
        super(name);
        this.size = size;
    }

    /**
     * 获取文件大小
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
