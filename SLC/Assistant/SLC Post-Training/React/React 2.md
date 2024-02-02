Query untuk select
Mutation untuk RUD

- npm install apollo
- ikutin get started yang ada di apollo (taroh di app.js aja gapapa)

gql untuk simpen querynya
```js
import { gql } from "@apollo/client";

export const GET_ALL_ANIME = gql`
    query getAllAnime($page:Int, $perPage:Int){
        Page(page:$page, perPage:$perPage){
        media(type:ANIME, sort:POPULARITY_DESC){
            id
            coverImage{
                large
            }
            title{
                english
            }
        }
        }
    }`;
```

# Cara 2
```js
export function CardContainer({media}){
    <div style={{
        display: "grid",
        gridTemplateColumns: "1fr 1fr 1fr 1fr 1fr",
        backgroundColor: "#000000",
        rowGap: "1rem",
        columnGap: "1rem",
    }}>
    
    <CardImage src={media.coverImage.large}/>
    <CardContent src={media.title}/>
    </div>
}

export function cardImage({ src }){
    <img src={media.coverImage.large} alt="" />
}

export function cardContent({title}){
    return <p>{title}</p>
}
```

## Cara 3 - Pake children
``` js
<CardContent>{media.title.english}</CardContent>
export function cardContent({ children }){
    return <p>{children}</p>
}
```


context: variabel yang bisa dipakai secara global