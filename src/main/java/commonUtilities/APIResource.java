package commonUtilities;

public enum APIResource {

	PostResource("/maps/api/place/add/json"), 
	GetResource("/maps/api/place/get/json"),
	PutResource("maps/api/place/update/json"), 
	DeleteResponse("maps/api/place/delete/json");

	private String resource;

	APIResource(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}
}
