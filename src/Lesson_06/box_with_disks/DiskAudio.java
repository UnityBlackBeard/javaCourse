package Lesson_06.box_with_disks;

  public class DiskAudio extends Disk{
//поля
  //private String name;
  private String singer;
  //private int year;
  private int countOfTracks;


    public DiskAudio(String name, int year, String singer, int countOfTracks) {
      super(name, year);
      this.singer = singer;
      this.countOfTracks = countOfTracks;
    }

    public String getSinger() {
      return singer;
    }

    public int getCountOfTracks() {
      return countOfTracks;
    }

    public void setSinger(String singer) {
      this.singer = singer;
    }

    public void setCountOfTracks(int countOfTracks) {
      this.countOfTracks = countOfTracks;
    }

    @Override
    public void printAllInfo() {

    }
  }
