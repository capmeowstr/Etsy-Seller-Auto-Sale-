# Android prototype

[Back to Daily Shop Sale](../README.md)

The prototype targets Android 9+ and uses Android Accessibility to interact with Etsy Seller in English. It reads the configured shop names from local app storage and uses the Etsy Seller session already on the phone. The prototype declares zero Internet permissions. Automatic runs start disabled.

## Sale preview

1. Add the shop names shown in Etsy Seller.
2. Enable the prototype’s Accessibility service.
3. Tap **Preview one shop** and check the dates, discount and listing selection. The preview pauses before the final review and submission steps.

The prototype determines dates from the phone’s calendar. Etsy controls when a promotion becomes active and expires.

## Test status

The Java workflow suite passed using simulated seller screens. It checks one- and two-shop flows, preview stopping before submission, missing controls, date pickers and year rollover. The public Java example covers the date and naming logic from the prototype.

The Android build awaits Etsy authorization, live-device verification and release signing. [Etsy Terms of Use](https://www.etsy.com/legal/terms-of-use)
