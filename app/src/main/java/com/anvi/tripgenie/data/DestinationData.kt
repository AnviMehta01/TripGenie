package com.anvi.tripgenie.data

import com.anvi.tripgenie.model.Destination

object DestinationData {

    val destinations = listOf(

        Destination(
            name = "Paris",
            country = "France",
            category = "⭐ Popular",
            rating = 4.9,
            budget = "₹1,80,000 - ₹2,50,000",
            bestTime = "🌸 April - June",
            mustVisit = listOf(
                "🗼 Eiffel Tower",
                "🎨 Louvre Museum",
                "🚢 Seine River Cruise"
            ),
            famousFood = listOf(
                "🥐 Croissants",
                "🍪 Macarons",
                "🍰 French Pastries"
            ),
            famousFestival = "🎉 Bastille Day",
            language = "🗣 French",
            currency = "💶 Euro (€)",
            perfectFor = "❤️ Couples & Art Lovers",
            funFact = "🧠 There are over 30 Eiffel Tower replicas around the world.",
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💶 Euro Cash/Card",
                "🧥 Light Jacket",
                "👟 Comfortable Walking Shoes",
                "📷 Camera",
                "🔌 Universal Travel Adapter",
                "🕶 Sunglasses",
                "🧴 Sunscreen",
                "💧 Water Bottle"
            ),
            tags = listOf("❤️ Romantic", "🎨 Art", "🥐 Food")
        ),

        Destination(
            name = "Tokyo",
            country = "Japan",
            category = "⭐ Popular",
            rating = 4.9,
            budget = "₹2,00,000 - ₹2,80,000",
            bestTime = "🌸 March - May",
            mustVisit = listOf(
                "🗼 Tokyo Tower",
                "🚦 Shibuya Crossing",
                "🗻 Mount Fuji"
            ),
            famousFood = listOf(
                "🍣 Sushi",
                "🍜 Ramen",
                "🍵 Matcha Desserts"
            ),
            famousFestival = "🌸 Cherry Blossom Festival",
            language = "🗣 Japanese",
            currency = "💴 Japanese Yen (¥)",
            perfectFor = "🍣 Foodies & 🎮 Anime Fans",
            funFact = "🧠 Tokyo has the highest number of Michelin-star restaurants in the world.",
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💴 Japanese Yen/Card",
                "📱 Phone + Charger",
                "🔌 Universal Travel Adapter",
                "👟 Comfortable Walking Shoes",
                "🧥 Light Jacket",
                "☂️ Foldable Umbrella",
                "📷 Camera",
                "💧 Water Bottle",
                "🧴 Sunscreen",
                "🚇 IC Travel Card (Suica/PASMO)"
            ),
            tags = listOf("🍣 Food", "🎮 Anime", "🌸 Culture")
        ),

        Destination(
            name = "Rome",
            country = "Italy",
            category = "🍜 Food Lover's Paradise",
            rating = 4.8,
            budget = "₹1,80,000 - ₹2,40,000",
            bestTime = "🌸 April - June",
            mustVisit = listOf(
                "🏛 Colosseum",
                "⛲ Trevi Fountain",
                "⛪ Vatican City"
            ),
            famousFood = listOf(
                "🍕 Pizza",
                "🍝 Pasta",
                "🍨 Gelato"
            ),
            famousFestival = "🎬 Rome Film Fest",
            language = "🗣 Italian",
            currency = "💶 Euro (€)",
            perfectFor = "🏛 History Lovers",
            funFact = "🧠 The Colosseum is nearly 2,000 years old.",
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💶 Euro Cash/Card",
                "📱 Phone + Charger",
                "🔌 Universal Travel Adapter",
                "👟 Comfortable Walking Shoes",
                "🧥 Light Jacket",
                "🕶 Sunglasses",
                "🧴 Sunscreen",
                "📷 Camera",
                "💧 Water Bottle",
                "🏛️ Museum Pass/Tickets"
            ),
            tags = listOf("🍕 Food", "🏛 History", "🏛 Architecture")
    ),

        Destination(
            name = "New York",
            country = "USA",
            category = "⭐ Popular",
            rating = 4.8,
            budget = "₹2,00,000 - ₹2,80,000",
            bestTime = "🌸 Apr - Jun",
            mustVisit = listOf(
                "🗽 Statue of Liberty",
                "🌳 Central Park",
                "🌆 Times Square"
            ),
            famousFood = listOf(
                "🍕 New York Pizza",
                "🥯 Bagels",
                "🍰 Cheesecake"
            ),
            famousFestival = "🎆 New Year's Eve at Times Square",
            language = "🗣 English",
            currency = "💵 US Dollar ($)",
            perfectFor = "🏙 City Lovers & Shopping",
            funFact = "🧠 Over 800 languages are spoken in New York!",
            tags = listOf(
                "🏙 City",
                "🛍 Shopping",
                "🌃 Nightlife"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💵 US Dollar/Card",
                "👟 Comfortable Walking Shoes",
                "🧥 Light Jacket",
                "🗽 City Pass (Optional)",
                "📷 Camera",
                "🔋 Power Bank",
                "💧 Water Bottle",
                "☂️ Foldable Umbrella"
            )
        ),

        Destination(
            name = "Santorini",
            country = "Greece",
            category = "⭐ Popular",
            rating = 4.9,
            budget = "₹1,90,000 - ₹2,70,000",
            bestTime = "☀️ May - Sep",
            mustVisit = listOf(
                "⛪ Blue Domes",
                "🌅 Oia Sunset",
                "🏖 Red Beach"
            ),
            famousFood = listOf(
                "🥗 Greek Salad",
                "🥧 Moussaka",
                "🍯 Baklava"
            ),
            famousFestival = "🎷 Santorini Jazz Festival",
            language = "🗣 Greek",
            currency = "💶 Euro (€)",
            perfectFor = "❤️ Couples & Photography",
            funFact = "🌋 Santorini was formed by a volcanic eruption!",
            tags = listOf(
                "❤️ Romantic",
                "📸 Photography",
                "🏖 Beach"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💶 Euro Cash/Card",
                "👙 Swimwear",
                "🩴 Flip-flops",
                "🧴 Sunscreen",
                "🕶 Sunglasses",
                "👒 Sun Hat",
                "📷 Camera",
                "🏖 Beach Towel"
            )
        ),

        Destination(
            name = "Singapore",
            country = "Singapore",
            category = "⭐ Popular",
            rating = 4.8,
            budget = "₹1,20,000 - ₹1,80,000",
            bestTime = "🌤 Feb - Apr",
            mustVisit = listOf(
                "🌳 Gardens by the Bay",
                "🏨 Marina Bay Sands",
                "🎢 Sentosa Island"
            ),
            famousFood = listOf(
                "🦀 Chilli Crab",
                "🍜 Laksa",
                "🍗 Hainanese Chicken Rice"
            ),
            famousFestival = "🧧 Chinese New Year",
            language = "🗣 English & Mandarin",
            currency = "💵 Singapore Dollar (S$)",
            perfectFor = "👨‍👩‍👧 Families",
            funFact = "🌳 Singapore is known as the Garden City.",
            tags = listOf(
                "👨‍👩‍👧 Family",
                "🍜 Food",
                "🌳 Nature"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💵 Singapore Dollar/Card",
                "👟 Comfortable Walking Shoes",
                "☂️ Umbrella",
                "🧴 Sunscreen",
                "🦟 Mosquito Repellent",
                "📷 Camera",
                "🔋 Power Bank",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "London",
            country = "United Kingdom",
            category = "⭐ Popular",
            rating = 4.8,
            budget = "₹2,10,000 - ₹2,90,000",
            bestTime = "🌸 May - Jul",
            mustVisit = listOf(
                "🕰 Big Ben",
                "🌉 Tower Bridge",
                "👑 Buckingham Palace"
            ),
            famousFood = listOf(
                "🐟 Fish & Chips",
                "🥧 Meat Pie",
                "🍳 English Breakfast"
            ),
            famousFestival = "🎭 Notting Hill Carnival",
            language = "🗣 English",
            currency = "💷 Pound Sterling (£)",
            perfectFor = "🏛 History Lovers",
            funFact = "🚇 London Underground is the world's oldest metro.",
            tags = listOf(
                "🏛 History",
                "🛍 Shopping",
                "🎭 Culture"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💷 Pound Sterling/Card",
                "🧥 Jacket",
                "☂️ Umbrella",
                "👟 Comfortable Walking Shoes",
                "📷 Camera",
                "🔌 Universal Travel Adapter",
                "🔋 Power Bank",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Hanoi",
            country = "Vietnam",
            category = "💰 Budget Friendly",
            rating = 4.7,
            budget = "₹45,000 - ₹70,000",
            bestTime = "🍂 Oct - Apr",
            mustVisit = listOf(
                "🏮 Old Quarter",
                "🌊 Hoan Kiem Lake",
                "🏯 Temple of Literature"
            ),
            famousFood = listOf(
                "🍜 Pho",
                "🥖 Banh Mi",
                "☕ Egg Coffee"
            ),
            famousFestival = "🧧 Tet Festival",
            language = "🗣 Vietnamese",
            currency = "💵 Vietnamese Dong",
            perfectFor = "🎒 Backpackers",
            funFact = "🧠 Hanoi is over 1,000 years old.",
            tags = listOf(
                "💰 Budget",
                "🍜 Food",
                "🏛 Culture"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💵 Vietnamese Dong",
                "👟 Comfortable Walking Shoes",
                "☂️ Umbrella",
                "🦟 Mosquito Repellent",
                "🧴 Sunscreen",
                "📷 Camera",
                "💧 Water Bottle",
                "🎒 Backpack"
            )
        ),

        Destination(
            name = "Kathmandu",
            country = "Nepal",
            category = "💰 Budget Friendly",
            rating = 4.7,
            budget = "₹35,000 - ₹60,000",
            bestTime = "🍂 Oct - Dec",
            mustVisit = listOf(
                "🐒 Swayambhunath",
                "🛕 Pashupatinath",
                "🏛 Durbar Square"
            ),
            famousFood = listOf(
                "🥟 Momos",
                "🍛 Dal Bhat"
            ),
            famousFestival = "🎉 Dashain",
            language = "🗣 Nepali",
            currency = "💵 Nepalese Rupee",
            perfectFor = "🥾 Adventure Lovers",
            funFact = "🧠 Kathmandu has 7 UNESCO World Heritage Sites.",
            tags = listOf(
                "💰 Budget",
                "🏔 Mountains",
                "🎒 Adventure"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💵 Nepalese Rupee",
                "🥾 Trekking Shoes",
                "🧥 Warm Jacket",
                "🧣 Scarf",
                "🧤 Gloves",
                "🕶 Sunglasses",
                "🎒 Backpack",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Yogyakarta",
            country = "Indonesia",
            category = "💰 Budget Friendly",
            rating = 4.7,
            budget = "₹40,000 - ₹65,000",
            bestTime = "☀️ May - Sep",
            mustVisit = listOf(
                "🛕 Borobudur",
                "🏯 Prambanan Temple",
                "🛍 Malioboro Street"
            ),
            famousFood = listOf(
                "🍛 Gudeg",
                "🥮 Bakpia"
            ),
            famousFestival = "🎊 Sekaten",
            language = "🗣 Indonesian",
            currency = "💵 Indonesian Rupiah",
            perfectFor = "🏛 Culture Lovers",
            funFact = "🧠 Borobudur is the world's largest Buddhist temple.",
            tags = listOf(
                "💰 Budget",
                "🏛 History",
                "🍜 Food"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💵 Indonesian Rupiah",
                "👟 Comfortable Walking Shoes",
                "🧢 Cap",
                "🧴 Sunscreen",
                "🦟 Mosquito Repellent",
                "📷 Camera",
                "🎒 Backpack",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Jaipur",
            country = "India",
            category = "💰 Budget Friendly",
            rating = 4.8,
            budget = "₹20,000 - ₹40,000",
            bestTime = "🍂 Oct - Mar",
            mustVisit = listOf(
                "🏰 Amber Fort",
                "🌸 Hawa Mahal",
                "👑 City Palace"
            ),
            famousFood = listOf(
                "🍛 Dal Baati Churma",
                "🍰 Ghewar"
            ),
            famousFestival = "🎉 Teej Festival",
            language = "🗣 Hindi",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "🏛 History Lovers",
            funFact = "🩷 Jaipur is called the Pink City.",
            tags = listOf(
                "💰 Budget",
                "🏰 Heritage",
                "📸 Photography"
            ),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "💰 Wallet",
                "📱 Phone + Charger",
                "🧢 Cap",
                "🕶 Sunglasses",
                "🧴 Sunscreen",
                "👟 Comfortable Walking Shoes",
                "📷 Camera",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Pondicherry",
            country = "India",
            category = "💰 Budget Friendly",
            rating = 4.7,
            budget = "₹18,000 - ₹35,000",
            bestTime = "🍂 Oct - Mar",
            mustVisit = listOf(
                "🏖 Promenade Beach",
                "🌿 Auroville",
                "🏘 French Quarter"
            ),
            famousFood = listOf(
                "🥐 French Pastries",
                "🦐 Seafood"
            ),
            famousFestival = "🎆 Bastille Day Celebration",
            language = "🗣 Tamil & French",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "😌 Relaxation",
            funFact = "🇫🇷 Pondicherry was once a French colony.",
            tags = listOf(
                "🏖 Beach",
                "💰 Budget",
                "😌 Relax"
            ),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "💰 Wallet",
                "📱 Phone + Charger",
                "👙 Swimwear",
                "🩴 Flip-flops",
                "🧴 Sunscreen",
                "🕶 Sunglasses",
                "🏖 Beach Towel",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Dubai",
            country = "UAE",
            category = "Popular",
            rating = 4.8,
            budget = "₹1,50,000 - ₹2,20,000",
            bestTime = "☀ Nov - Mar",
            mustVisit = listOf(
                "🏙 Burj Khalifa",
                "🏜 Desert Safari",
                "🛍 Dubai Mall"
            ),
            famousFood = listOf(
                "🥙 Shawarma",
                "🍢 Kebabs",
                "🍰 Kunafa"
            ),
            famousFestival = "✨ Dubai Shopping Festival",
            language = "🗣 Arabic",
            currency = "💰 UAE Dirham",
            perfectFor = "💎 Luxury Trips",
            funFact = "The Burj Khalifa is the world's tallest building.",
            tags = listOf(
                "🏙 Luxury",
                "🛍 Shopping",
                "🏜 Desert"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💰 UAE Dirham/Card",
                "🧢 Cap",
                "🕶 Sunglasses",
                "🧴 SPF 50 Sunscreen",
                "👕 Light Cotton Clothes",
                "📷 Camera",
                "💧 Water Bottle",
                "🔌 Universal Adapter"
            )
        ),

        Destination(
            name = "Bali",
            country = "Indonesia",
            category = "Budget Friendly",
            rating = 4.9,
            budget = "₹70,000 - ₹1,10,000",
            bestTime = "☀ Apr - Oct",
            mustVisit = listOf(
                "🌾 Tegallalang Rice Terrace",
                "🏖 Kuta Beach",
                "🛕 Uluwatu Temple"
            ),
            famousFood = listOf(
                "🍚 Nasi Goreng",
                "🍢 Satay",
                "🥗 Gado-Gado"
            ),
            famousFestival = "🎉 Nyepi Festival",
            language = "🗣 Indonesian",
            currency = "💵 Indonesian Rupiah",
            perfectFor = "🌴 Beaches & Nature",
            funFact = "Bali celebrates an entire day of silence every year.",
            tags = listOf(
                "🏖 Beach",
                "💰 Budget",
                "🌴 Nature"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💵 Indonesian Rupiah",
                "👙 Swimwear",
                "🩴 Flip-flops",
                "🧴 Sunscreen",
                "🕶 Sunglasses",
                "🏖 Beach Towel",
                "📷 Camera",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Bangkok",
            country = "Thailand",
            category = "Food Paradise",
            rating = 4.8,
            budget = "₹80,000 - ₹1,20,000",
            bestTime = "❄ Nov - Feb",
            mustVisit = listOf(
                "🛕 Grand Palace",
                "🛶 Floating Market",
                "🌃 Chinatown"
            ),
            famousFood = listOf(
                "🍜 Pad Thai",
                "🥭 Mango Sticky Rice",
                "🍲 Tom Yum Soup"
            ),
            famousFestival = "💦 Songkran Festival",
            language = "🗣 Thai",
            currency = "💰 Thai Baht",
            perfectFor = "🍜 Food Lovers",
            funFact = "Bangkok has one of the world's largest street food cultures.",
            tags = listOf(
                "🍜 Food",
                "💰 Budget",
                "🛕 Temples"
            ),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💰 Thai Baht",
                "👟 Comfortable Walking Shoes",
                "🧴 Sunscreen",
                "🦟 Mosquito Repellent",
                "📷 Camera",
                "🔋 Power Bank",
                "💧 Water Bottle",
                "🎒 Day Backpack"
            )
        ),

        Destination(
            name = "Kyoto",
            country = "Japan",
            category = "🏛 History & Culture",
            rating = 4.9,
            budget = "₹1,80,000 - ₹2,40,000",
            bestTime = "🌸 Mar - May",
            mustVisit = listOf(
                "⛩ Fushimi Inari Shrine",
                "🌸 Arashiyama Bamboo Forest",
                "🏯 Kinkaku-ji Temple"
            ),
            famousFood = listOf(
                "🍵 Matcha",
                "🍱 Kaiseki",
                "🍡 Yatsuhashi"
            ),
            famousFestival = "🌸 Gion Matsuri",
            language = "🗣 Japanese",
            currency = "💴 Japanese Yen (¥)",
            perfectFor = "🏯 Culture Lovers",
            funFact = "🧠 Kyoto was Japan's capital for over 1,000 years.",
            tags = listOf("🏯 History", "🌸 Culture", "📸 Photography"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💴 Japanese Yen/Card",
                "👟 Comfortable Walking Shoes",
                "🧥 Light Jacket",
                "☂️ Foldable Umbrella",
                "📷 Camera",
                "🔌 Universal Travel Adapter",
                "💧 Water Bottle",
                "🎒 Day Backpack"
            )
        ),

        Destination(
            name = "Goa",
            country = "India",
            category = "🏖 Beach Escapes",
            rating = 4.8,
            budget = "₹25,000 - ₹45,000",
            bestTime = "☀ Nov - Feb",
            mustVisit = listOf(
                "🏖 Baga Beach",
                "🌅 Palolem Beach",
                "⛪ Basilica of Bom Jesus"
            ),
            famousFood = listOf(
                "🍛 Goan Fish Curry",
                "🥧 Bebinca",
                "🦐 Prawn Balchão"
            ),
            famousFestival = "🎉 Goa Carnival",
            language = "🗣 Konkani",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "🏖 Beach Lovers",
            funFact = "🧠 Goa has India's smallest area but one of its longest coastlines.",
            tags = listOf("🏖 Beach", "🎉 Party", "🌅 Sunset"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "💰 Wallet",
                "👙 Swimwear",
                "🩴 Flip-flops",
                "🧴 Sunscreen",
                "🕶 Sunglasses",
                "🏖 Beach Towel",
                "📷 Camera",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Kashmir",
            country = "India",
            category = "🏔 Mountain Escapes",
            rating = 4.9,
            budget = "₹45,000 - ₹80,000",
            bestTime = "🌸 Apr - Oct",
            mustVisit = listOf(
                "🚣 Dal Lake",
                "⛷ Gulmarg",
                "🌼 Tulip Garden"
            ),
            famousFood = listOf(
                "🍛 Rogan Josh",
                "🍚 Kashmiri Pulao",
                "☕ Kahwa"
            ),
            famousFestival = "🌷 Tulip Festival",
            language = "🗣 Kashmiri",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "❄ Snow Lovers",
            funFact = "🧠 Asia's largest tulip garden is in Srinagar.",
            tags = listOf("❄ Snow", "🏔 Mountains", "📸 Nature"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "🧥 Heavy Jacket",
                "🧤 Gloves",
                "🧣 Woollen Scarf",
                "🥾 Trekking Shoes",
                "🧦 Woollen Socks",
                "🕶 Sunglasses",
                "💧 Water Bottle",
                "📷 Camera"
            )
        ),

        Destination(
            name = "Agra",
            country = "India",
            category = "🏛 History & Culture",
            rating = 4.8,
            budget = "₹20,000 - ₹35,000",
            bestTime = "🍂 Oct - Mar",
            mustVisit = listOf(
                "🤍 Taj Mahal",
                "🏰 Agra Fort",
                "🌅 Mehtab Bagh"
            ),
            famousFood = listOf(
                "🍬 Agra Petha",
                "🥘 Mughlai Cuisine"
            ),
            famousFestival = "🎉 Taj Mahotsav",
            language = "🗣 Hindi",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "📜 History Lovers",
            funFact = "🧠 The Taj Mahal changes colour during the day.",
            tags = listOf("🏛 Heritage", "📸 Photography", "❤️ Wonder"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "👟 Comfortable Walking Shoes",
                "🧢 Cap",
                "🕶 Sunglasses",
                "🧴 Sunscreen",
                "📷 Camera",
                "💧 Water Bottle",
                "🎒 Small Backpack",
                "💰 Wallet"
            )
        ),

        Destination(
            name = "Seoul",
            country = "South Korea",
            category = "🍜 Food Lover's Paradise",
            rating = 4.8,
            budget = "₹1,60,000 - ₹2,20,000",
            bestTime = "🌸 Apr - Jun",
            mustVisit = listOf(
                "🏯 Gyeongbokgung Palace",
                "🛍 Myeongdong",
                "🌃 N Seoul Tower"
            ),
            famousFood = listOf(
                "🥟 Kimchi",
                "🍗 Korean BBQ",
                "🍜 Tteokbokki"
            ),
            famousFestival = "🌸 Cherry Blossom Festival",
            language = "🗣 Korean",
            currency = "💴 South Korean Won (₩)",
            perfectFor = "🎵 K-pop & Food Lovers",
            funFact = "🧠 Seoul has one of the world's fastest internet networks.",
            tags = listOf("🍜 Food", "🎵 K-pop", "🛍 Shopping"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💴 Korean Won/Card",
                "👟 Comfortable Walking Shoes",
                "🧥 Light Jacket",
                "📷 Camera",
                "🔋 Power Bank",
                "🔌 Universal Adapter",
                "💧 Water Bottle",
                "🎒 Day Backpack"
            )
        ),

        Destination(
            name = "Hallstatt",
            country = "Austria",
            category = "💎 Hidden Gems",
            rating = 4.9,
            budget = "₹1,90,000 - ₹2,60,000",
            bestTime = "🌸 May - Sep",
            mustVisit = listOf(
                "🏞 Hallstatt Lake",
                "⛪ Market Square",
                "🧂 Salt Mine"
            ),
            famousFood = listOf(
                "🥟 Austrian Dumplings",
                "🍎 Apple Strudel"
            ),
            famousFestival = "🎶 Hallstatt Lake Festival",
            language = "🗣 German",
            currency = "💶 Euro (€)",
            perfectFor = "📸 Photography Lovers",
            funFact = "🧠 Hallstatt is one of the oldest continuously inhabited villages in Europe.",
            tags = listOf("💎 Hidden Gem","📸 Photography","🏞 Nature"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💶 Euro Cash/Card",
                "🧥 Warm Jacket",
                "👟 Walking Shoes",
                "📷 Camera",
                "🎒 Day Backpack",
                "☂️ Umbrella",
                "💧 Water Bottle",
                "🔌 Universal Adapter"
            )
        ),

        Destination(
            name = "Chefchaouen",
            country = "Morocco",
            category = "💎 Hidden Gems",
            rating = 4.8,
            budget = "₹90,000 - ₹1,30,000",
            bestTime = "🌸 Mar - May",
            mustVisit = listOf(
                "💙 Blue Streets",
                "🏰 Kasbah Museum",
                "🌄 Spanish Mosque"
            ),
            famousFood = listOf(
                "🥘 Tagine",
                "🍵 Mint Tea"
            ),
            famousFestival = "🎉 Ras El Maa Festival",
            language = "🗣 Arabic",
            currency = "💰 Moroccan Dirham",
            perfectFor = "📷 Photographers",
            funFact = "🧠 Almost the entire town is painted blue.",
            tags = listOf("💎 Hidden Gem","💙 Blue City","📷 Photography"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💰 Moroccan Dirham",
                "👟 Comfortable Walking Shoes",
                "🧢 Cap",
                "🕶 Sunglasses",
                "🧴 Sunscreen",
                "📷 Camera",
                "💧 Water Bottle",
                "🎒 Day Backpack"
            )
        ),

        Destination(
            name = "Lake Bled",
            country = "Slovenia",
            category = "💎 Hidden Gems",
            rating = 4.9,
            budget = "₹1,40,000 - ₹1,90,000",
            bestTime = "☀️ Jun - Sep",
            mustVisit = listOf(
                "🚣 Lake Bled",
                "🏰 Bled Castle",
                "⛪ Bled Island"
            ),
            famousFood = listOf(
                "🍰 Bled Cream Cake",
                "🥟 Dumplings"
            ),
            famousFestival = "🎻 Bled Days",
            language = "🗣 Slovene",
            currency = "💶 Euro (€)",
            perfectFor = "🌿 Nature Lovers",
            funFact = "🧠 Ringing the church bell on Bled Island is said to bring good luck.",
            tags = listOf("💎 Hidden Gem","🌿 Nature","🚣 Lake"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💶 Euro Cash/Card",
                "🧥 Light Jacket",
                "👟 Hiking Shoes",
                "📷 Camera",
                "🎒 Day Backpack",
                "💧 Water Bottle",
                "☂️ Umbrella",
                "🔌 Universal Adapter"
            )
        ),

        Destination(
            name = "Rio de Janeiro",
            country = "Brazil",
            category = "🎉 Festival Destinations",
            rating = 4.9,
            budget = "₹1,80,000 - ₹2,50,000",
            bestTime = "🎊 Feb - Mar",
            mustVisit = listOf(
                "⛰ Christ the Redeemer",
                "🏖 Copacabana Beach",
                "🚠 Sugarloaf Mountain"
            ),
            famousFood = listOf(
                "🥘 Feijoada",
                "🧀 Pão de Queijo"
            ),
            famousFestival = "🎭 Rio Carnival",
            language = "🗣 Portuguese",
            currency = "💰 Brazilian Real",
            perfectFor = "🎉 Festival Lovers",
            funFact = "🧠 Rio Carnival is the world's biggest carnival.",
            tags = listOf("🎉 Festival","🏖 Beach","💃 Dance"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💰 Brazilian Real",
                "👙 Swimwear",
                "🩴 Flip-flops",
                "🧴 Sunscreen",
                "🕶 Sunglasses",
                "💃 Festival Outfit",
                "📷 Camera",
                "💧 Water Bottle"
            )
        ),

        Destination(
            name = "Munich",
            country = "Germany",
            category = "🎉 Festival Destinations",
            rating = 4.8,
            budget = "₹1,80,000 - ₹2,40,000",
            bestTime = "🍂 Sep - Oct",
            mustVisit = listOf(
                "🏰 Nymphenburg Palace",
                "⛪ Marienplatz",
                "🌳 English Garden"
            ),
            famousFood = listOf(
                "🥨 Pretzel",
                "🌭 Bratwurst"
            ),
            famousFestival = "🍺 Oktoberfest",
            language = "🗣 German",
            currency = "💶 Euro (€)",
            perfectFor = "🍺 Festival Lovers",
            funFact = "🧠 Oktoberfest welcomes millions of visitors every year.",
            tags = listOf("🎉 Festival","🍺 Oktoberfest","🏰 Culture"),
            packingItems = listOf(
                "🛂 Passport",
                "🎫 Flight Tickets",
                "💶 Euro Cash/Card",
                "🧥 Jacket",
                "👟 Comfortable Walking Shoes",
                "☂️ Umbrella",
                "📷 Camera",
                "🔌 Universal Adapter",
                "💧 Water Bottle",
                "🎒 Day Backpack"
            )
        ),

        Destination(
            name = "Varanasi",
            country = "India",
            category = "🎉 Festival Destinations",
            rating = 4.8,
            budget = "₹20,000 - ₹40,000",
            bestTime = "🍂 Oct - Mar",
            mustVisit = listOf(
                "🛶 Dashashwamedh Ghat",
                "🛕 Kashi Vishwanath Temple",
                "🌅 Ganga Aarti"
            ),
            famousFood = listOf(
                "🍅 Tamatar Chaat",
                "🥛 Lassi"
            ),
            famousFestival = "🪔 Dev Deepawali",
            language = "🗣 Hindi",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "🙏 Spiritual Travelers",
            funFact = "🧠 Varanasi is one of the world's oldest continuously inhabited cities.",
            tags = listOf("🙏 Spiritual","🪔 Festival","📿 Heritage"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "👟 Comfortable Walking Shoes",
                "🧣 Light Shawl",
                "📷 Camera",
                "💧 Water Bottle",
                "💰 Wallet",
                "📱 Phone + Charger",
                "🧴 Hand Sanitizer",
                "🎒 Small Backpack"
            )
        ),

        Destination(
            name = "Munnar",
            country = "India",
            category = "🏔 Mountain Escapes",
            rating = 4.8,
            budget = "₹25,000 - ₹45,000",
            bestTime = "☀️ Sep - Mar",
            mustVisit = listOf(
                "🌿 Tea Gardens",
                "🏞 Eravikulam National Park",
                "💧 Attukad Waterfalls"
            ),
            famousFood = listOf(
                "🥥 Kerala Sadya",
                "🍌 Banana Chips"
            ),
            famousFestival = "🚣 Onam",
            language = "🗣 Malayalam",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "🌿 Nature Lovers",
            funFact = "🧠 Munnar is famous for its endless tea plantations.",
            tags = listOf("🏔 Mountains","🌿 Nature","🍃 Tea"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "🧥 Light Jacket",
                "👟 Trekking Shoes",
                "☂️ Umbrella",
                "🦟 Mosquito Repellent",
                "📷 Camera",
                "💧 Water Bottle",
                "🎒 Backpack",
                "🧴 Sunscreen"
            )
        ),

        Destination(
            name = "Tawang",
            country = "India",
            category = "💎 Hidden Gems",
            rating = 4.9,
            budget = "₹35,000 - ₹60,000",
            bestTime = "🌸 Mar - Jun",
            mustVisit = listOf(
                "🛕 Tawang Monastery",
                "🏔 Sela Pass",
                "💧 Nuranang Falls"
            ),
            famousFood = listOf(
                "🥟 Momos",
                "🍜 Thukpa"
            ),
            famousFestival = "🎊 Torgya Festival",
            language = "🗣 Monpa",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "🏔 Adventure Lovers",
            funFact = "🧠 Tawang Monastery is India's largest monastery.",
            tags = listOf("💎 Hidden Gem","🏔 Adventure","🛕 Monastery"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "🧥 Heavy Jacket",
                "🧤 Gloves",
                "🧣 Woollen Scarf",
                "🥾 Trekking Shoes",
                "🎒 Backpack",
                "📷 Camera",
                "💧 Water Bottle",
                "🕶 Sunglasses"
            )
        ),

        Destination(
            name = "Gokarna",
            country = "India",
            category = "🏖 Beach Escapes",
            rating = 4.8,
            budget = "₹18,000 - ₹35,000",
            bestTime = "☀️ Oct - Mar",
            mustVisit = listOf(
                "🏖 Om Beach",
                "🌅 Kudle Beach",
                "🛕 Mahabaleshwar Temple"
            ),
            famousFood = listOf(
                "🍛 Seafood Thali",
                "🥥 Coconut Sweets"
            ),
            famousFestival = "🎉 Mahashivratri",
            language = "🗣 Kannada",
            currency = "💰 Indian Rupee (₹)",
            perfectFor = "😌 Peaceful Getaways",
            funFact = "🧠 Gokarna is often called the quieter alternative to Goa.",
            tags = listOf("🏖 Beach","😌 Peaceful","🌅 Sunset"),
            packingItems = listOf(
                "🪪 Government ID",
                "🚆/✈️ Tickets",
                "👙 Swimwear",
                "🩴 Flip-flops",
                "🧴 Sunscreen",
                "🕶 Sunglasses",
                "🏖 Beach Towel",
                "📷 Camera",
                "💧 Water Bottle",
                "🎒 Small Backpack"
            )
        )
    )
}