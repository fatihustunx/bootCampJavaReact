package zyzz2;

public class GamerManager implements IGamerService {
	
	private IGamerCheckService _gamerCheckService;
	
	

	public GamerManager(IGamerCheckService _gamerCheckService) {
		super();
		this._gamerCheckService = _gamerCheckService;
	}

	@Override
	public void saveToGamer(Gamer gamer) throws Exception {

		if(_gamerCheckService.checkIfRealPerson(gamer)) {
		System.out.println("Ba�ar�yla kaydedildi : " + gamer.getFirstName());
		}
		else {
			throw new Exception("not a valid gamer");
		}
		
	}

	@Override
	public void updateToGamer(Gamer gamer) throws Exception {

		// updating codes
		
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ba�ar�yla g�ncellendi : " + gamer.getFirstName());
			}
			else {
				throw new Exception("not a valid gamer");
			}
	}

	@Override
	public void deleteToGamer(Gamer gamer) {

		System.out.println("Ba�ar�yla silindi : " + gamer.getFirstName());
	}

	
}
