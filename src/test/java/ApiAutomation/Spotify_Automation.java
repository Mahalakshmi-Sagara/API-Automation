package ApiAutomation;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Spotify_Automation {

    @Test
    public void Get_Current_Users_Profile() {
        String token = "BQB4I8QL6swMt5QQRhUKvTWWH_hSY9D-frIg69smbPi7Nnq1r1WIDIdVrEUR7HgcBrhv-6nm-N3yYmymwSCj1rhO16SDUosfyiUpibFljERg1orUrCSyw7eT6U7fTSNYSCzRRjaEitRwxbNP9o_qKMQAj4Fk2u5p4aHeDnb2npg6IgzZwabmB3UiqNY0xZkLDdGq6uLLLPRz97YQWtsQKLk5lsv65JXMV8NjTPRzmSTTwrYuhgzK66CSeRM1CtKBPMWwrqZr1X_dKVcX-YSh0kIo-wLSzayz6QFcmPq4iyEpXUhfeF2v0l4u3YovWApQxepQuRCS3LjS&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me");

        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void Get_Users_Top_Items() {
        String token = "BQDI_yG2jS9urCJANua-D9h2ejtUDCIo8opEieNDOq76IC1Bkt6POAWdn9Z01yc_aA26MzCJqRZhHbFitQWIMcIj8R-aujrwGaLbKvTi-a7hh_rWL3OUuucNaQmkk2Qrw8BoEdEBAabV-0mmbUvm-ZyFB9E6A-uH8PxV6lfi1nTeSWLFIeEiKmQZeHV9QFZGBfhoZ2IGswyL6IpwdJze4ogpvszewjdN8uUhFT8Zdn4dXmbb-DvpYcVlS34yx9CCmx4EUEfhTxuE-tD53gvLv_tcrRX8C5OhhlyvD6G97EGYbmnq5QyHROVv9OzvWdOWzLg3OGw4KOfG&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/top/artists");

        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void Get_Users_Profile()
    {
        String token = "BQAq3JFINDWa3chfkm6LVeMDzkFp4D3TmqUt_PHppWVC2tLIJZC74UvXWR0_PVKjr1xBrpn0IdUpAg9uglxy2gahUFhQsFU97k6qFuGdfbHlqFd4Dgs6fDL2jeFlA7S0LticRFl2qusCyPVyy6QeOaSNoL1-C4iSdulfwesQjzzIYuyuwYWzUO4T1Of3q08wXwRN3uE6D3VCRz-3AJE3lE9INNBvoUi7XHvEmfrFJ8RCWdhhlA68Iz7KkDB9CrdkI259RJmwbnPptKoX-FxU_5qTmjkeXGwj-eu1qZ8w8d9Z3fRQ4UQyHHd8lHqke7tjM7kyWo2TgVOh&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/users/31qo2f3wyr2nyvlftenysidgbnse");

        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void Unfollow_Playlist()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .delete("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS/followers");

        response.prettyPrint();

    }
    @Test
    public void Get_Followed_Artists()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/following?type=artist");

        response.prettyPrint();
        response.then().statusCode(200);

    }
    @Test
    public void Follow_Artists_or_Users()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body(" {ids:[\"74ASZWbe4lXaubB36ztrGX\", \"08td7MxkoHQkXnWAYD8d6Q\"]}")
                .when()
                .put("https://api.spotify.com/v1/me/following?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");

        response.prettyPrint();
    }
    @Test
    public void Unfollow_Artists_or_Users()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body(" {ids:[\"74ASZWbe4lXaubB36ztrGX\", \"08td7MxkoHQkXnWAYD8d6Q\"]}")
                .when()
                .delete("https://api.spotify.com/v1/me/following?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");

        response.prettyPrint();
    }
    @Test
    public void Check_If_User_Follows_Artists_or_Users()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
        response.prettyPrint();
    }
    @Test
    public void CheckifUsersFollowPlaylist()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS/followers/contains?ids=jmperezperez%2Cthelinmichael%2Cwizzler");
        response.prettyPrint();
    }
    @Test
    public void GetPlaylist()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS");
        response.prettyPrint();
    }
    @Test
    public void ChangePlaylistDetails()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{\n" +
                        "    \"name\": \"Playlist Updated\",\n" +
                        "    \"description\": \"my fiirst update\",\n" +
                        "    \"public\": false\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS");
        response.prettyPrint();
    }
    @Test
    public void CreatePlaylist()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{\n" +
                        "    \"name\": \"Myplaylist\",\n" +
                        "    \"description\": \"my first song\",\n" +
                        "    \"public\": false\n" +
                        "}")
                .when()
                .post("https://api.spotify.com/v1/users/31qo2f3wyr2nyvlftenysidgbnse/playlists");
        response.prettyPrint();
    }
    @Test
    public void GetPlaylistItems()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token

                .when()
                .get("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS/tracks");
        response.prettyPrint();
    }
    @Test
    public void UpdatePlaylistItems()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{\n" +
                        "    \"range_start\": 1,\n" +
                        "    \"insert_before\": 3,\n" +
                        "    \"range_length\": 2\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks");
        response.prettyPrint();
    }
    @Test
    public void AddItemstoPlaylist()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{\"uris\": [\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\",\"spotify:track:1301WleyT98MSxVHPZCA6M\", \"spotify:episode:512ojhOuo1ktJprKbVcKyQ\"]}")
                .when()
                .post("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS/tracks ");
        response.prettyPrint();
    }
    @Test
    public void RemovePlaylistItems()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{ \"tracks\": [{ \"uri\": \"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\" },{ \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\" }] }")
                .when()
                .delete("https://api.spotify.com/v1/playlists/5HIKoUu96w9m4jWy10AcpS/tracks");
        response.prettyPrint();
    }
    @Test
    public void GetCurrentUsersPlaylists()
    {
        String token = "BQBaFQZpOxz4XAMcOkT033XJ3VuGn35pwtveHalx5Qu1loKofSSxZBUvPANFvZO4-E-rmbndAXABw_40ZTfzrZ_H3bM7KQXQ3jwHLfN4ybKRgmYfZQkd-Ai38SWwqrsLr90z7Y_GGmmxPBb-iZJ1zwRtcXU7xYTBJpSSr2KwWyLbQOWOL-66EBconKKPf6F4_dexPdsL2MVlPb3suXHNulE2tuCdkzqaBNszfy2IwOfBNMt4AJ6CqXSWWaa_RB8zGZp0OMOuoIb7Ia5m1ZoguEeeMgOnpFLr-668mA4kEPkIT4IxhOz8DX21jFn6z6Ggkx7QHBxalMXo&token_type=Bearer&expires_in=3600&state=state";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/playlists");
        response.prettyPrint();
    }
    @Test
    public void GetUsersPlaylists()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/users/31qo2f3wyr2nyvlftenysidgbnse/playlists");
        response.prettyPrint();
    }
    @Test
    public void GetFeaturedPlaylists()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/browse/featured-playlists");
        response.prettyPrint();
    }
    @Test
    public void GetCategorysPlaylists()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/browse/categories/dinner/playlists ");
        response.prettyPrint();
    }
    @Test
    public void GetPlaylistCoverImage()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/images");
        response.prettyPrint();
    }
    @Test
    public void AddCustomPlaylistCoverImage()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("/9j/2wCEABoZGSccJz4lJT5CLy8vQkc9Ozs9R0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0cBHCcnMyYzPSYmPUc9Mj1HR0dEREdHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR//dAAQAAf/uAA5BZG9iZQBkwAAAAAH/wAARCAABAAEDACIAAREBAhEB/8QASwABAQAAAAAAAAAAAAAAAAAAAAYBAQAAAAAAAAAAAAAAAAAAAAAQAQAAAAAAAAAAAAAAAAAAAAARAQAAAAAAAAAAAAAAAAAAAAD/2gAMAwAAARECEQA/AJgAH//Z")
                .when()
                .put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/images");
        response.prettyPrint();
    }
    @Test
    public void GetTrack()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("/9j/2wCEABoZGSccJz4lJT5CLy8vQkc9Ozs9R0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0cBHCcnMyYzPSYmPUc9Mj1HR0dEREdHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR//dAAQAAf/uAA5BZG9iZQBkwAAAAAH/wAARCAABAAEDACIAAREBAhEB/8QASwABAQAAAAAAAAAAAAAAAAAAAAYBAQAAAAAAAAAAAAAAAAAAAAAQAQAAAAAAAAAAAAAAAAAAAAARAQAAAAAAAAAAAAAAAAAAAAD/2gAMAwAAARECEQA/AJgAH//Z")
                .when()
                .get("https://api.spotify.com/v1/tracks/11dFghVXANMlKmJXsNCbNl");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralTracks()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("/9j/2wCEABoZGSccJz4lJT5CLy8vQkc9Ozs9R0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0cBHCcnMyYzPSYmPUc9Mj1HR0dEREdHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR//dAAQAAf/uAA5BZG9iZQBkwAAAAAH/wAARCAABAAEDACIAAREBAhEB/8QASwABAQAAAAAAAAAAAAAAAAAAAAYBAQAAAAAAAAAAAAAAAAAAAAAQAQAAAAAAAAAAAAAAAAAAAAARAQAAAAAAAAAAAAAAAAAAAAD/2gAMAwAAARECEQA/AJgAH//Z")
                .when()
                .get("https://api.spotify.com/v1/tracks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
        response.prettyPrint();
    }
    @Test
    public void GetUsersSavedTracks ()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("/9j/2wCEABoZGSccJz4lJT5CLy8vQkc9Ozs9R0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0cBHCcnMyYzPSYmPUc9Mj1HR0dEREdHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR0dHR//dAAQAAf/uAA5BZG9iZQBkwAAAAAH/wAARCAABAAEDACIAAREBAhEB/8QASwABAQAAAAAAAAAAAAAAAAAAAAYBAQAAAAAAAAAAAAAAAAAAAAAQAQAAAAAAAAAAAAAAAAAAAAARAQAAAAAAAAAAAAAAAAAAAAD/2gAMAwAAARECEQA/AJgAH//Z")
                .when()
                .get("https://api.spotify.com/v1/me/tracks");
        response.prettyPrint();
    }
    @Test
    public void SaveTracksforCurrentUser()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("[\"4iV5W9uYEdYUVa79Axb7Rh\", \"1301WleyT98MSxVHPZCA6M\"]")
                .when()
                .put("https://api.spotify.com/v1/me/tracks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
        response.prettyPrint();
    }
    @Test
    public void RemoveUsersSavedTracks()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("[\"4iV5W9uYEdYUVa79Axb7Rh\", \"1301WleyT98MSxVHPZCA6M\"]")
                .when()
                .delete("https://api.spotify.com/v1/me/tracks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
        response.prettyPrint();
    }
    @Test
    public void CheckUsersSavedTracks()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/tracks/contains?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralTracksAudioFeatures()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/audio-features?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
        response.prettyPrint();
    }
    @Test
    public void GetTracksAudioFeatures()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/audio-features/11dFghVXANMlKmJXsNCbNl");
        response.prettyPrint();
    }
    @Test
    public void GetTracksAudioAnalysis()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/audio-analysis/11dFghVXANMlKmJXsNCbNl");
        response.prettyPrint();
    }
    @Test
    public void GetRecommendations()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/recommendations?seed_artists=4NHQUGzhtTLFvgF5SZesLK&seed_genres=classical%2Ccountry&seed_tracks=0c6xIDDpzE81m2q797ordA");
        response.prettyPrint();
    }
    @Test
    public void GetShow()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ");
        response.prettyPrint();
    }

    @Test
    public void GetShowEpisodes()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ/episodes ");
        response.prettyPrint();
    }
    @Test
    public void GetUsersSavedShows()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/shows");
        response.prettyPrint();
    }
    @Test
    public void SaveShowsforCurrentUser()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/shows?ids=5CfCWKI5pZ28U0uOzXkDHe%2C5as3aKmN2k11yfDDDSrvaZ");
        response.prettyPrint();
    }
    @Test
    public void RemoveUsersSavedShows()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .delete("https://api.spotify.com/v1/me/shows?ids=5CfCWKI5pZ28U0uOzXkDHe%2C5as3aKmN2k11yfDDDSrvaZ");
        response.prettyPrint();
    }
    @Test
    public void CheckUsersSavedShows()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/shows/contains?ids=5CfCWKI5pZ28U0uOzXkDHe%2C5as3aKmN2k11yfDDDSrvaZ");
        response.prettyPrint();
    }
    @Test
    public void SearchforItem()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/search?q=remaster%2520track%3ADoxy%2520artist%3AMiles%2520Davis&type=album");
        response.prettyPrint();
    }
    @Test
    public void GetPlaybackState()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get(" https://api.spotify.com/v1/me/player");
        response.prettyPrint();
    }
    @Test
    public void TransferPlayback()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{\n" +
                        "    \"device_ids\": [\n" +
                        "        \"74ASZWbe4lXaubB36ztrGX\"\n" +
                        "    ]\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/me/player");
        response.prettyPrint();
    }
    @Test
    public void GetAvailableDevices()
    {
        String token = "BQCp4RPGZE802dWqeixRs-SPrAHGVnDkaPV1CG3O7KNscKU9qiXgfFRNCx43FtCSbFWvkns_xTCw2SMdnDUSHEVjYF0zzgmPxAaHa8X5AYt-i6-repnZJYpuf0dUVBTXHhIiL588xTahB3kfT535VKf-j_MC_UAbG1ZmhoHwyM2I4YF8RIrTP3FFYIwucGL4APexjMtN4UfLv-oz9-xOWRlZlAEViTUbKz3A5Hl0VefjTzxJV6tQBkqudZV_5pO8lNKIoQTLFe9y8-ZleVONpBqbS3a_CasMIUMb88pKCoIM5LkI08TeruaCJowWKLqpPxlFJNI1umy6&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/player/devices ");
        response.prettyPrint();
    }
    @Test
    public void GetCurrentlyPlayingTrack()
    {
        String token = "BQAHKaVuCowWWkB08miaG4enEybEq_CIqmrlP2bJIZztIhpzmZ0IF5BlWL08EiGeW0DeZ6VWGrX_DflYoT8GSYok1dD0MHUy569e8sPQZDcJN_dp0AhmpAsxlC7uIfl0odxWTR2SxvZXONjtJBobNuv0mHxisRrzFq3BFRd8kcGn6an5ysTuDywpmyWoW8TujbREywDAwmLadzrLT81iUXUS8CuWiZWoPFCc-lfleMrY50s5kRQJjMEcgEfurvcsjE8MO4FDS7gKQ26RU2Ret4fX2GSTXweTBCZnXsr4nivKsqsBEIpR51Yja-JCA70brMoP_o7IMchQ&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/player/currently-playing");
        response.prettyPrint();
    }
    @Test
    public void StartOrResumePlayback()
    {
        String token = "BQAHKaVuCowWWkB08miaG4enEybEq_CIqmrlP2bJIZztIhpzmZ0IF5BlWL08EiGeW0DeZ6VWGrX_DflYoT8GSYok1dD0MHUy569e8sPQZDcJN_dp0AhmpAsxlC7uIfl0odxWTR2SxvZXONjtJBobNuv0mHxisRrzFq3BFRd8kcGn6an5ysTuDywpmyWoW8TujbREywDAwmLadzrLT81iUXUS8CuWiZWoPFCc-lfleMrY50s5kRQJjMEcgEfurvcsjE8MO4FDS7gKQ26RU2Ret4fX2GSTXweTBCZnXsr4nivKsqsBEIpR51Yja-JCA70brMoP_o7IMchQ&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("{\n" +
                        "    \"context_uri\": \"spotify:album:5ht7ItJgpBH7W6vJ5BqpPr\",\n" +
                        "    \"offset\": {\n" +
                        "        \"position\": 5\n" +
                        "    },\n" +
                        "    \"position_ms\": 0\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/me/player/play");
        response.prettyPrint();
    }
    @Test
    public void PausePlayback()
    {
        String token = "BQAHKaVuCowWWkB08miaG4enEybEq_CIqmrlP2bJIZztIhpzmZ0IF5BlWL08EiGeW0DeZ6VWGrX_DflYoT8GSYok1dD0MHUy569e8sPQZDcJN_dp0AhmpAsxlC7uIfl0odxWTR2SxvZXONjtJBobNuv0mHxisRrzFq3BFRd8kcGn6an5ysTuDywpmyWoW8TujbREywDAwmLadzrLT81iUXUS8CuWiZWoPFCc-lfleMrY50s5kRQJjMEcgEfurvcsjE8MO4FDS7gKQ26RU2Ret4fX2GSTXweTBCZnXsr4nivKsqsBEIpR51Yja-JCA70brMoP_o7IMchQ&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/player/pause");
        response.prettyPrint();
    }
    @Test
    public void SkipToNext()
    {
        String token = "BQAHKaVuCowWWkB08miaG4enEybEq_CIqmrlP2bJIZztIhpzmZ0IF5BlWL08EiGeW0DeZ6VWGrX_DflYoT8GSYok1dD0MHUy569e8sPQZDcJN_dp0AhmpAsxlC7uIfl0odxWTR2SxvZXONjtJBobNuv0mHxisRrzFq3BFRd8kcGn6an5ysTuDywpmyWoW8TujbREywDAwmLadzrLT81iUXUS8CuWiZWoPFCc-lfleMrY50s5kRQJjMEcgEfurvcsjE8MO4FDS7gKQ26RU2Ret4fX2GSTXweTBCZnXsr4nivKsqsBEIpR51Yja-JCA70brMoP_o7IMchQ&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .post(" https://api.spotify.com/v1/me/player/next");
        response.prettyPrint();
    }
    @Test
    public void SkipToPrevious()
    {
        String token = "BQAHKaVuCowWWkB08miaG4enEybEq_CIqmrlP2bJIZztIhpzmZ0IF5BlWL08EiGeW0DeZ6VWGrX_DflYoT8GSYok1dD0MHUy569e8sPQZDcJN_dp0AhmpAsxlC7uIfl0odxWTR2SxvZXONjtJBobNuv0mHxisRrzFq3BFRd8kcGn6an5ysTuDywpmyWoW8TujbREywDAwmLadzrLT81iUXUS8CuWiZWoPFCc-lfleMrY50s5kRQJjMEcgEfurvcsjE8MO4FDS7gKQ26RU2Ret4fX2GSTXweTBCZnXsr4nivKsqsBEIpR51Yja-JCA70brMoP_o7IMchQ&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .post("https://api.spotify.com/v1/me/player/previous");
        response.prettyPrint();
    }
    @Test
    public void SeekToPosition()
    {
        String token = "BQAHKaVuCowWWkB08miaG4enEybEq_CIqmrlP2bJIZztIhpzmZ0IF5BlWL08EiGeW0DeZ6VWGrX_DflYoT8GSYok1dD0MHUy569e8sPQZDcJN_dp0AhmpAsxlC7uIfl0odxWTR2SxvZXONjtJBobNuv0mHxisRrzFq3BFRd8kcGn6an5ysTuDywpmyWoW8TujbREywDAwmLadzrLT81iUXUS8CuWiZWoPFCc-lfleMrY50s5kRQJjMEcgEfurvcsjE8MO4FDS7gKQ26RU2Ret4fX2GSTXweTBCZnXsr4nivKsqsBEIpR51Yja-JCA70brMoP_o7IMchQ&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/player/seek?position_ms=25000");
        response.prettyPrint();
    }
    @Test
    public void SetRepeatMode()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/player/repeat?state=context");
        response.prettyPrint();
    }
    @Test
    public void SetPlaybackVolume()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/player/volume?volume_percent=50");
        response.prettyPrint();
    }
    @Test
    public void TogglePlaybackShuffle()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/player/shuffle?state=true");
        response.prettyPrint();
    }
    @Test
    public void GetRecentlyPlayedTracks()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/player/recently-played");
        response.prettyPrint();
    }
    @Test
    public void GettheUsersQueue()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/player/queue");
        response.prettyPrint();
    }
    @Test
    public void AddItemtoPlaybackQueue()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .post("https://api.spotify.com/v1/me/player/queue?uri=spotify%3Atrack%3A4iV5W9uYEdYUVa79Axb7Rh");
        response.prettyPrint();
    }
    @Test
    public void GetAvailableMarkets()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/markets");
        response.prettyPrint();
    }
    @Test
    public void GetAvailableGenreSeeds()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/recommendations/available-genre-seeds");
        response.prettyPrint();
    }
    @Test
    public void GetEpisode()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/episodes/512ojhOuo1ktJprKbVcKyQ");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralEpisodes()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/episodes?ids=77o6BIVlYM3msb4MMIL1jH%2C0Q86acNRm6V9GYx55SXKwf");
        response.prettyPrint();
    }
    @Test
    public void GetUsersSavedEpisodes()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get(" https://api.spotify.com/v1/me/episodes");
        response.prettyPrint();
    }
    @Test
    public void SaveEpisodesforCurrentUser()
    {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("ids=77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .when()
                .put("https://api.spotify.com/v1/me/episodes?ids=77o6BIVlYM3msb4MMIL1jH%2C0Q86acNRm6V9GYx55SXKwf");
        response.prettyPrint();
    }
    @Test
    public void RemoveUsersSavedEpisodes() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("ids=7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                .when()
                .delete("https://api.spotify.com/v1/me/episodes?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
        response.prettyPrint();
    }
    @Test
    public void CheckUsersSavedEpisodes() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/episodes/contains?ids=77o6BIVlYM3msb4MMIL1jH%2C0Q86acNRm6V9GYx55SXKwf");
        response.prettyPrint();
    }
    @Test
    public void GetaChapter() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/chapters/0D5wENdkdwbqlrHoaJ9g29");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralChapters() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/chapters?ids=0IsXVP0JmcB2adSE338GkK%2C3ZXb8FKZGU0EHALYX6uCzU%2C0D5wENdkdwbqlrHoaJ9g29");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralBrowseCategories() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/browse/categories");
        response.prettyPrint();
    }
    @Test
    public void GetSingleBrowseCategory() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/browse/categories/dinner");
        response.prettyPrint();
    }
    @Test
    public void GetanAudiobook() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/audiobooks/7iHfbu1YPACw6oZPAFJtqe");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralAudiobooks() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/audiobooks?ids=18yVqkdbdRvS24c0Ilj2ci%2C1HGw3J3NxZO1TP1BTtVhpZ%2C7iHfbu1YPACw6oZPAFJtqe");
        response.prettyPrint();
    }
    @Test
    public void GetAudiobookChapters() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/audiobooks/7iHfbu1YPACw6oZPAFJtqe/chapters");
        response.prettyPrint();
    }
    @Test
    public void GetUsersSavedAudiobooks() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/audiobooks");
        response.prettyPrint();
    }
    @Test
    public void SaveAudiobooksforCurrentUser() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .put("https://api.spotify.com/v1/me/audiobooks?ids=18yVqkdbdRvS24c0Ilj2ci%2C1HGw3J3NxZO1TP1BTtVhpZ%2C7iHfbu1YPACw6oZPAFJtqe");
        response.prettyPrint();
    }
    @Test
    public void RemoveUsersSavedAudiobooks() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .delete("https://api.spotify.com/v1/me/audiobooks?ids=18yVqkdbdRvS24c0Ilj2ci%2C1HGw3J3NxZO1TP1BTtVhpZ%2C7iHfbu1YPACw6oZPAFJtqe");
        response.prettyPrint();
    }
    @Test
    public void CheckUsersSavedAudiobooks() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/audiobooks/contains?ids=18yVqkdbdRvS24c0Ilj2ci%2C1HGw3J3NxZO1TP1BTtVhpZ%2C7iHfbu1YPACw6oZPAFJtqe");
        response.prettyPrint();
    }
    @Test
    public void GetArtist() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralArtists() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/artists?ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
        response.prettyPrint();
    }
    @Test
    public void GetArtistsAlbums() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/albums");
        response.prettyPrint();
    }
    @Test
    public void GetArtistsTopTracks() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/top-tracks");
        response.prettyPrint();
    }
    @Test
    public void GetArtistsRelatedArtists() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/related-artists");
        response.prettyPrint();
    }
    @Test
    public void GetAlbum() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy");
        response.prettyPrint();
    }
    @Test
    public void GetSeveralAlbums() {
        String token = "BQB5B5RC_ZJq_6KwzfYGC1dmG_UYSLYQRA-qEKaBP7kDEj5q-uEc8UauaEfFogjNQEuT4NBSq7b5ebrs45APsSQdjQTX3nTm2w_vESbVfPt2cv2yqJI-z94ibeDotm-iFUeJnhDqInyQqZNVKWP-YTHYGLj6Ol3v6KUv9U-oTPX8rG87JeL_i8Xgv1T-QNOhYGVRRCmSWtY72sbOXl5GCmxUWkDPjtkLxxHqs6D8eGaS6t3sGglzxzajD5hU2xpkogooZhZwdMD18dlQt96Om4lIlLZYIbj_a1GJaXZarlh3vgS8mFuYNBtVDrZUBH4dXZwr2gW1ARVr&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/albums?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
    }
    @Test
    public void GetAlbumTracks() {
        String token = "BQAz50bcGhB-LYqHi63cAwzvsu6bQ2CBPImep079F79ibLrhAn2oH7mTVEEAcRhnd6SledLr6SwseGZwgcQhX3pgySYwj2Z2RzQ4P56jv2oaOz9tW1fQz_mS8a1UdIbPRyNvTzGcS8DqosyXM7Pv7iibiC72WubCpWsfQgfHkCYZ2zN03eOzzgIPxSzOh2dh-cQJBYcScatTn7kMiVWQaZg3bq_PDKplcZ0kBbmEYQYXZisDLQp6m8HmoMstqCQKdkHgKA_5-EDapzBWmi0h0wBovfnbtUzmgoruX4lbpXjwynV_ID4v1e11vdGAMzjOql8TgdhEUlEw&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks");
        response.prettyPrint();
    }
    @Test
    public void GetUsersSavedAlbums() {
        String token = "BQAz50bcGhB-LYqHi63cAwzvsu6bQ2CBPImep079F79ibLrhAn2oH7mTVEEAcRhnd6SledLr6SwseGZwgcQhX3pgySYwj2Z2RzQ4P56jv2oaOz9tW1fQz_mS8a1UdIbPRyNvTzGcS8DqosyXM7Pv7iibiC72WubCpWsfQgfHkCYZ2zN03eOzzgIPxSzOh2dh-cQJBYcScatTn7kMiVWQaZg3bq_PDKplcZ0kBbmEYQYXZisDLQp6m8HmoMstqCQKdkHgKA_5-EDapzBWmi0h0wBovfnbtUzmgoruX4lbpXjwynV_ID4v1e11vdGAMzjOql8TgdhEUlEw&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .when()
                .get("https://api.spotify.com/v1/me/albums");
        response.prettyPrint();
    }
    @Test
    public void SaveAlbumsforCurrentUser() {
        String token = "BQAz50bcGhB-LYqHi63cAwzvsu6bQ2CBPImep079F79ibLrhAn2oH7mTVEEAcRhnd6SledLr6SwseGZwgcQhX3pgySYwj2Z2RzQ4P56jv2oaOz9tW1fQz_mS8a1UdIbPRyNvTzGcS8DqosyXM7Pv7iibiC72WubCpWsfQgfHkCYZ2zN03eOzzgIPxSzOh2dh-cQJBYcScatTn7kMiVWQaZg3bq_PDKplcZ0kBbmEYQYXZisDLQp6m8HmoMstqCQKdkHgKA_5-EDapzBWmi0h0wBovfnbtUzmgoruX4lbpXjwynV_ID4v1e11vdGAMzjOql8TgdhEUlEw&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("[\"4iV5W9uYEdYUVa79Axb7Rh\", \"1301WleyT98MSxVHPZCA6M\"]")
                .when()
                .put("https://api.spotify.com/v1/me/albums?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
    }
    @Test
    public void RemoveUsersSavedAlbums() {
        String token = "BQAz50bcGhB-LYqHi63cAwzvsu6bQ2CBPImep079F79ibLrhAn2oH7mTVEEAcRhnd6SledLr6SwseGZwgcQhX3pgySYwj2Z2RzQ4P56jv2oaOz9tW1fQz_mS8a1UdIbPRyNvTzGcS8DqosyXM7Pv7iibiC72WubCpWsfQgfHkCYZ2zN03eOzzgIPxSzOh2dh-cQJBYcScatTn7kMiVWQaZg3bq_PDKplcZ0kBbmEYQYXZisDLQp6m8HmoMstqCQKdkHgKA_5-EDapzBWmi0h0wBovfnbtUzmgoruX4lbpXjwynV_ID4v1e11vdGAMzjOql8TgdhEUlEw&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("[\"4iV5W9uYEdYUVa79Axb7Rh\", \"1301WleyT98MSxVHPZCA6M\"]")
                .when()
                .delete("https://api.spotify.com/v1/me/albums?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
    }
    @Test
    public void CheckUsersSavedAlbums() {
        String token = "BQAz50bcGhB-LYqHi63cAwzvsu6bQ2CBPImep079F79ibLrhAn2oH7mTVEEAcRhnd6SledLr6SwseGZwgcQhX3pgySYwj2Z2RzQ4P56jv2oaOz9tW1fQz_mS8a1UdIbPRyNvTzGcS8DqosyXM7Pv7iibiC72WubCpWsfQgfHkCYZ2zN03eOzzgIPxSzOh2dh-cQJBYcScatTn7kMiVWQaZg3bq_PDKplcZ0kBbmEYQYXZisDLQp6m8HmoMstqCQKdkHgKA_5-EDapzBWmi0h0wBovfnbtUzmgoruX4lbpXjwynV_ID4v1e11vdGAMzjOql8TgdhEUlEw&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("[\"4iV5W9uYEdYUVa79Axb7Rh\", \"1301WleyT98MSxVHPZCA6M\"]")
                .when()
                .get("https://api.spotify.com/v1/me/albums/contains?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc");
        response.prettyPrint();
    }
    @Test
    public void GetNewReleases() {
        String token = "BQAz50bcGhB-LYqHi63cAwzvsu6bQ2CBPImep079F79ibLrhAn2oH7mTVEEAcRhnd6SledLr6SwseGZwgcQhX3pgySYwj2Z2RzQ4P56jv2oaOz9tW1fQz_mS8a1UdIbPRyNvTzGcS8DqosyXM7Pv7iibiC72WubCpWsfQgfHkCYZ2zN03eOzzgIPxSzOh2dh-cQJBYcScatTn7kMiVWQaZg3bq_PDKplcZ0kBbmEYQYXZisDLQp6m8HmoMstqCQKdkHgKA_5-EDapzBWmi0h0wBovfnbtUzmgoruX4lbpXjwynV_ID4v1e11vdGAMzjOql8TgdhEUlEw&token_type=Bearer&expires_in=3600&state=state";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)  // Include the Authorization header with the token
                .body("[\"4iV5W9uYEdYUVa79Axb7Rh\", \"1301WleyT98MSxVHPZCA6M\"]")
                .when()
                .get("https://api.spotify.com/v1/browse/new-releases");
        response.prettyPrint();
    }






















}
