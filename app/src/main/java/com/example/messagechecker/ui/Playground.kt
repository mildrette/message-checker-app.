package com.example.messagechecker.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class CheatSection(
    val title: String,
    val emoji: String,
    val items: List<CheatItem>
)

data class CheatItem(
    val name: String,
    val explanation: String,
    val code: String? = null
)

private val sections = listOf(
    CheatSection("Start Here", "", listOf(
        CheatItem("@Composable", "Marks a Kotlin function as something that can build UI.",
            "@Composable\nfun Hello() {\n    Text(\"Hello\")\n}"),
        CheatItem("Column", "Puts things from top to bottom.", "Column {\n    Text(\"One\")\n    Text(\"Two\")\n}"),
        CheatItem("Row", "Puts things side by side.", "Row {\n    Text(\"One\")\n    Text(\"Two\")\n}"),
        CheatItem("Box", "Stacks things on top of each other.", "Box {\n    Image(...)\n    Text(\"On top\")\n}")
    )),
    CheatSection("Modifiers", "", listOf(
        CheatItem("Modifier", "A chain of instructions that changes size, position, appearance, or behavior."),
        CheatItem("padding()", "Adds space around content.", "Modifier.padding(16.dp)"),
        CheatItem("fillMaxWidth()", "Uses all available width.", "Modifier.fillMaxWidth()"),
        CheatItem("fillMaxSize()", "Uses all available width and height.", "Modifier.fillMaxSize()"),
        CheatItem("widthIn()", "Sets minimum and/or maximum width.", "Modifier.widthIn(max = 600.dp)"),
        CheatItem("weight()", "Takes a share of remaining space.", "Modifier.weight(1f)")
    )),
    CheatSection("Spacing & Alignment", "", listOf(
        CheatItem("Arrangement.spacedBy()", "Adds even space between children.",
            "Column(\n    verticalArrangement = Arrangement.spacedBy(16.dp)\n)"),
        CheatItem("Alignment.Center", "Centers content.", "contentAlignment = Alignment.Center"),
        CheatItem("Spacer", "An empty piece of space.", "Spacer(Modifier.height(16.dp))"),
        CheatItem("dp vs sp", "Use dp for UI sizes. Use sp for text.", "16.dp   // UI\n18.sp   // text")
    )),
    CheatSection("Text", "", listOf(
        CheatItem("Text", "Displays words.", "Text(\"Hello\")"),
        CheatItem("Typography", "Uses your Material text styles.", "style = MaterialTheme.typography.titleLarge"),
        CheatItem("fontWeight", "Controls how thick text is.", "fontWeight = FontWeight.Bold"),
        CheatItem("maxLines", "Stops text from growing forever.", "maxLines = 2"),
        CheatItem("Ellipsis", "Shows ... when text is too long.",
            "overflow = TextOverflow.Ellipsis")
    )),
    CheatSection("Material Components", "", listOf(
        CheatItem("Card", "Groups related content in a raised/container surface.",
            "Card(shape = RoundedCornerShape(16.dp)) {\n    Text(\"Hello\")\n}"),
        CheatItem("Button", "A button that performs an action.",
            "Button(onClick = { }) {\n    Text(\"Save\")\n}"),
        CheatItem("OutlinedButton", "A less prominent outlined button.",
            "OutlinedButton(onClick = { }) { ... }"),
        CheatItem("IconButton", "A clickable button designed for an icon.",
            "IconButton(onClick = { }) {\n    Icon(Icons.Default.Close, \"Close\")\n}"),
        CheatItem("Surface", "A Material container for color, shape and elevation.")
    )),
    CheatSection("State", "", listOf(
        CheatItem("mutableStateOf", "Creates a value that Compose watches.",
            "var count by remember {\n    mutableStateOf(0)\n}"),
        CheatItem("remember", "Keeps a value during recomposition.",
            "var open by remember {\n    mutableStateOf(false)\n}"),
        CheatItem("rememberSaveable", "Like remember, but can survive common recreation events.",
            "var name by rememberSaveable {\n    mutableStateOf(\"\")\n}"),
        CheatItem("Show / Hide", "Use state with if to control visibility.",
            "if (showCard) {\n    DefaultSmsCard()\n}")
    )),
    CheatSection("Lists & Grids", "", listOf(
        CheatItem("LazyColumn", "A smart scrolling vertical list.",
            "LazyColumn {\n    items(items) { item ->\n        ItemCard(item)\n    }\n}"),
        CheatItem("LazyRow", "A smart horizontal list.",
            "LazyRow {\n    items(items) { item -> ... }\n}"),
        CheatItem("LazyVerticalGrid", "A scrolling grid.",
            "LazyVerticalGrid(\n    columns = GridCells.Adaptive(140.dp)\n) { ... }"),
        CheatItem("GridCells.Adaptive", "Lets the grid decide how many columns fit.",
            "GridCells.Adaptive(minSize = 140.dp)")
    )),
    CheatSection("Screen Structure", "", listOf(
        CheatItem("Scaffold", "A skeleton for a Material screen: top bar, bottom bar, FAB and content.",
            "Scaffold(\n    topBar = { TopAppBar(...) }\n) { innerPadding ->\n    Content(Modifier.padding(innerPadding))\n}"),
        CheatItem("Screen container", "A good responsive default is full width with a maximum content width.",
            "Modifier\n    .fillMaxWidth()\n    .widthIn(max = 600.dp)\n    .padding(horizontal = 16.dp)"),
        CheatItem("Responsive UI", "Design for available space, not specific phone models."),
        CheatItem("Window size classes", "Use Compact, Medium and Expanded widths to change layouts.")
    )),
    CheatSection("Effects & ViewModels", "", listOf(
        CheatItem("LaunchedEffect", "Runs a coroutine when a composable enters or a key changes.",
            "LaunchedEffect(Unit) {\n    viewModel.load()\n}"),
        CheatItem("ViewModel", "Keeps screen logic and state outside the UI."),
        CheatItem("collectAsStateWithLifecycle", "Turns a lifecycle-aware Flow into Compose state.",
            "val state by viewModel.uiState\n    .collectAsStateWithLifecycle()")
    )),
    CheatSection("Theme & Accessibility", "", listOf(
        CheatItem("MaterialTheme", "Your app's colors, typography and shapes.",
            "MaterialTheme.colorScheme.primary"),
        CheatItem("contentDescription", "Explains important icons/images to accessibility tools.",
            "contentDescription = \"Close\""),
        CheatItem("Touch target", "Keep interactive targets comfortable to tap; IconButton gives a proper touch area."),
        CheatItem("Dark mode", "Prefer MaterialTheme colors instead of hardcoded white/black.")
    )),
    CheatSection("Golden Rules", "", listOf(
        CheatItem("1. Build small pieces", "Break giant screens into reusable composables."),
        CheatItem("2. Use constraints", "Prefer fillMaxWidth, widthIn, weight and adaptive grids over magic numbers."),
        CheatItem("3. Avoid random offsets", "If you need offset() to make a normal layout work, rethink the layout."),
        CheatItem("4. Keep state in the right place", "The parent often owns important state and passes callbacks to children."),
        CheatItem("5. Design for all screens", "Think Compact, Medium and Expanded—not specific phone models.")
    ))
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheatSheetApp() {
    var search by rememberSaveable { mutableStateOf("") }
    var darkMode by rememberSaveable { mutableStateOf(false) }

    val filteredSections = remember(search) {
        if (search.isBlank()) sections
        else sections.mapNotNull { section ->
            val matches = section.items.filter {
                it.name.contains(search, true) ||
                        it.explanation.contains(search, true) ||
                        (it.code?.contains(search, true) == true)
            }
            if (matches.isNotEmpty()) section.copy(items = matches) else null
        }
    }

    MaterialTheme(
        colorScheme = if (darkMode) darkColorScheme() else lightColorScheme()
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Column {
                            Text("Compose Cheat Sheet", fontWeight = FontWeight.Bold)
                            Text(
                                "A friendly Android UI guide",
                                style = MaterialTheme.typography.labelMedium
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = { darkMode = !darkMode }) {
                            Icon(
                                if (darkMode) Icons.Default.LightMode else Icons.Default.DarkMode,
                                contentDescription = "Toggle dark mode"
                            )
                        }
                    }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    singleLine = true,
                    label = { Text("Search the cheat sheet") },
                    leadingIcon = {
                        Icon(Icons.Default.Search, contentDescription = null)
                    },
                    trailingIcon = {
                        if (search.isNotEmpty()) {
                            IconButton(onClick = { search = "" }) {
                                Icon(Icons.Default.Clear, contentDescription = "Clear search")
                            }
                        }
                    }
                )

                if (filteredSections.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Nothing found. Try another word.")
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        contentPadding = PaddingValues(bottom = 32.dp)
                    ) {
                        items(filteredSections) { section ->
                            SectionCard(section)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SectionCard(section: CheatSection) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(section.emoji, fontSize = 24.sp)
                Spacer(Modifier.width(10.dp))
                Text(
                    section.title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            section.items.forEach { item ->
                CheatItemView(item)
            }
        }
    }
}

@Composable
fun CheatItemView(item: CheatItem) {
    Column(
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Text(
            item.name,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            item.explanation,
            style = MaterialTheme.typography.bodyMedium
        )

        item.code?.let {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                color = MaterialTheme.colorScheme.surfaceVariant
            ) {
                Text(
                    text = it,
                    modifier = Modifier.padding(12.dp),
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun ComposeCheatSheetTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography(),
        content = content
    )
}


@Preview
@Composable
fun CheatSheetAppPreview(){
    CheatSheetApp()
}