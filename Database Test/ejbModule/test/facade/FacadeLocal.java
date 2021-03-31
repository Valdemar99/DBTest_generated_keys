package test.facade;

import javax.ejb.Local;

import test.ejb.Video;

@Local
public interface FacadeLocal {
	public Video findVideo(String videoId);
	public Video createVideo(Video video);
	public Video updateVideo(Video video);
	public void deleteVideo(String videoId);
}
