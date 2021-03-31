package test.eao;

import javax.ejb.Local;

import test.ejb.Video;

@Local
public interface VideoEAOLocal {
	public Video findVideo(String videoId);
	public Video createVideo(Video video);
	public Video updateVideo(Video video);
	public void deleteVideo(String videoId);
}
