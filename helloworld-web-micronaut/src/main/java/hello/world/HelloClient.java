package hello.world;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;
import io.reactivex.Single;

@Client("/")
public interface HelloClient {
    @Get
    Single<String> hello();
}