package test.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import test.eao.VideoEAOLocal;
import test.ejb.Video;

/**
 * Session Bean implementation class Facade
 */
@Stateless
public class Facade implements FacadeLocal {
	@EJB
	VideoEAOLocal videoEAO;
    /**
     * Default constructor. 
     */
    public Facade() {
        // TODO Auto-generated constructor stub
    }

	
	public Video findVideo(String videoId) {
		return videoEAO.findVideo(videoId);
	}

	
	public Video createVideo(Video video) {
		return videoEAO.createVideo(video);

	}

	
	public Video updateVideo(Video video) {
		return videoEAO.updateVideo(video);
	}

	
	public void deleteVideo(String videoId) {
		videoEAO.deleteVideo(videoId);		
	}

}
