package com.example.hw2_q3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw2_q3.ui.theme.HW2Q3Theme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HW2Q3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FunFact(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FunFact(modifier: Modifier = Modifier) {
    var i: Int by remember { mutableStateOf(value = Random.nextInt(0, names.size)) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(       // animal name
        text = names[i],
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.secondaryContainer,
        modifier = Modifier
            .padding(8.dp)
            .height(50.dp),
        textAlign = TextAlign.Center
        )

        Box(
            modifier = Modifier
                .padding(8.dp)
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(12.dp)
                )
                .border(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(16.dp)
        ) {
            Text(       // fun fact
                text = text[i],
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = {
                i = Random.nextInt(0, names.size)
            },
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {
            Text(
                text = "New fact",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HW2Q3Theme {
        FunFact()
    }
}




val names = listOf("Raccoon",
    "Malayan flying fox",
    "Aye-aye",
    "Lemur",
    "Liger",
    "Western gorilla",
    "Woodlouse",
    "Bluefin tuna",
    "Rove beetle",
    "Hutia",
    "Honduran white bat",
    "Grizzly bear",
    "Whale",
    "Weddell seal",
    "Flamingo",
    "Red-tailed comet",
    "Milkfish",
    "Gollie",
    "Red panda",
    "Yellow-footed tortoise",
    "Fainting goat",
    "Bobcat",
    "Rosy maple moth",
    "Arctic fox",
    "Pudelpointer",
    "Alligator gar",
    "Puppy",
    "Mandarin rat snake",
    "Tarsier",
    "Cat snake",
    "King cobra",
    "Bighorn sheep",
    "Binturong",
    "Poison dart frog",
    "Moose",
    "Giraffe",
    "Stick insect",
    "Hercules beetle",
    "Camel",
    "Bonobo",
    "Dromedary camel",
    "Blue gray gnatcatcher",
    "Lionfish",
    "Piranha",
    "Spanish dancer",
    "Rosy maple moth",
    "Lemming",
    "Atlantic porkfish",
    "Cheetah",
    "Urechis unicinctus (penis fish)")

val text = listOf("Many raccoon babies starve in the winter. Unlike many mammals in their habitats, raccoons don’t hibernate. They instead spend extended periods of time in their dens during cold weather.",
    "Flying foxes have long, sharp, curved claws on their toes which allow them to hang effortlessly upside-down in trees.",
    "Aye-ayes have a system when it comes to digging out food.The Aye-aye will start foraging between 30-minutes and 3-hours after sunset with roughly 80-percent of the night spent digging out grubs from trees in the canopy. They will take the odd rest period. The Aye-aye climbs trees using vertical leaps in the same basic manner that squirrels do. They find moving horizontally far more difficult and they do not normally go down in order to climb another tree. An average night will see an Aye-Aye cover up to 4-kilometres during a foraging session.",
    "The aye-aye has a special, long, boney finger, for hunting insects",
    "Hybrid big cats are known to be fertile. There is a great deal of documentation on this subject. In fact, the fertility of big cat females includes many different hybrids. There is actually a rule that describes it: in hybrid animals, where their sex is determined by sex chromosomes, if one sex is absent, rare or happens to be sterile, the animal will be born heterogametric – the sex that had two different sex chromosomes. It is called Haldane’s Rule. There are other hybrids in the animal kingdom that are actually sterile.",
    "There are two sub-species!",
    "3,710 woodlouse species have been recorded, so far. This was as of 2014, and there are thought to be between 5,000 – 7,000 woodlice species living today worldwide!",
    "The bluefin is one of the largest fish in the world",
    "When threatened, rove beetles raise the ends of their body like scorpions, but they have no sting.",
    "Hutias are fairly large rodents that inhabit the islands of the Caribbean, and they resemble nutrias (coypus) to some degree. Depending on the species, they can weigh from 2 to 8.5 kg (4.4 - 18.7 lbs). This is first time video footage of hutias in Cuba as they feed around coastal limestone caves.",
    "The bat only eats figs.",
    "A new-born baby grizzly bear is smaller than a guinea pig -  Amazing Grizzly Bear Facts!",
    "The killer whale is a actually the largest species of dolphin.",
    "Weddell seals have the southernmost distribution of any pinniped.",
    "flamingos are the colour of what they eat. Usually shrimp.",
    "The red-tailed comet (Sappho sparganurus) is a hummingbird native to Bolivia, Argentina, Chile and Peru. The male has an iridescent, golden-reddish forked tail, longer than the length of its body. This red-tailed comet stops by the home of someone watering their flowers with a hose and takes a bath.",
    "Females lay up to 5 million eggs at one time in warm, shallow and salty waters",
    "They bark at strangers, cars, and loud noises like airplanes.",
    "They can stand on their rear legs. This has been witnessed in zoos, when they are asking for food (and almost waving!)",
    "Yellow-footed tortoises are hunted for food in their native countries. Tortoises are considered \"fish\" by the Catholic Church and during holy week, red and yellow-foots are consumed in huge quantities.",
    "They suffer from a disorder called ‘Myotonia Congenita’. Myotonia (a condition which affects both animals and humans) is a muscle stiffness disorder that causes the goat to tense its muscles when startled or excited. As the animal’s muscles don’t immediately relax after the fright, it will stiffen and fall.",
    "About double the size of a domestic cat!",
    "As larvae, they can deliver a dangerous sting!. Even though they’re harmless as adults (mostly due to the fact they have no true mouth to bite you with), as larvae, the rosy maple moth can deliver a venomous sting! While it’s not enough to be fatal for most humans, their small spines can be painful if handled the wrong way, which is why it’s always best to observe unknown species from afar – even insects like these.",
    "Extremely thick winter fur!",
    "Like their poodle parent, Pudelpointers love to swim in pools!",
    "The alligator gar has toxic eggs to protect against predators",
    "They are usually able to walk about by 21 days old",
        "This docile snake is a popular and long-lived pet - though challenging to care for - with a lifespan of up to 21 years!",
    "They’re the only venomous primate. When you think of venomous animals, you probably think of snakes or spiders. However, the tarsier is unique in that it’s the only venomous (and poisonous!) primate.",
    "Some cat snakes have a prehensile tail that helps them climb into trees.",
    "They Are the Smartest Snakes in the World. Experts have named the king cobra the smartest snake in existence.",
    "Bighorn rams can run at speeds up to 40 miles per hour when fighting for dominance.",
    "Also known as the Asian Bearcat!",
    "They are poisonous, not venomous. This means that they do not inject their toxins into others, like snakes, they instead have to be consumed or licked.",
    "Renews it's enormous antlers every year!",
    "Giraffes can kill some of Africa’s top predators. While giraffes may have several predators, they can easily turn the tables and kill some of Africa’s top predators, including lions. This is thanks to their powerful kicks, which can easily protect them from small groups of predators.",
    "They have been used as fish hooks. In the D’Entrecasteaux Islands, just off the coast of New Guinea, native islanders have been witnessed using the legs of stick insects as fish hooks.",
    "They are harmless. While their long horns may look dangerous, they are not aggressive and completely harmless to humans as they don’t really bite or sting.",
    "Camels feet expand when bearing weight to keep them from sinking in the sand",
    "The bonobo and the chimpanzee are our closest living relatives sharing 98.7% of our DNA",
    "Dromedary Camels may be occasionally preyed upon by wolves.",
    "Joy and happiness are the spiritual meaning of this bird.",
    "Their expansion is truly unprecedented. To many marine biologists, the rate at which lionfish numbers have grown is astounding.",
    "Piranha need warm water to survive. As opposed to requiring warm blood – thanks to the world of horror movies – piranha can’t live in water that is less than 54-degrees F.",
    "Even their movement is kinda gross. When slugging around on the bottom of the sea, the Spanish dancer curls up its edges, or mantle into what’s appealingly termed a “peripheral blister”. This certainly doesn’t help its aesthetic, but it does function to keep the mantle out of the way while it moves.",
    "They can lay up to 200 eggs in a single breeding season. While it may be sad that these amazing moths are only alive for a short time, they spend the remainder of their lives as adults ensuring that the species as a whole will be around for a while.",
    "They like to be alone. Lemmings are not social creatures and prefer to keep to themselves.",
    "The Atlantic porkfish is the only Caribbean grunt with two black vertical bars and yellow stripes.",
    "Cheetas are so closely related to each other that you can freely transplant organs between all members of their species without needing immunosuppression.",
    "Create \"inns\" for other sea creatures")