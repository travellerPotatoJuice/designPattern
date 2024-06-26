package org.example;

public class Linux extends OperatingSystem{
    public Linux(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }


}
